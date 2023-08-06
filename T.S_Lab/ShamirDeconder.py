# หาค่าผกผันโมดูลัส
def _extended_gcd(a, b):
    """
    Division in integers modulus p means finding the inverse of the
    denominator modulo p and then multiplying the numerator by this
    inverse (Note: inverse of A is B such that A*B % p == 1). This can
    be computed via the extended Euclidean algorithm
    http://en.wikipedia.org/wiki/Modular_multiplicative_inverse#Computation
    """
    x = 0
    last_x = 1
    y = 1
    last_y = 0
    while b != 0:
        quot = a // b
        a, b = b, a % b
        x, last_x = last_x - quot * x, x
        y, last_y = last_y - quot * y, y
    return last_x, last_y
# คำนวนตัวเลขที่ได้หารกับค่าโมดูลัส 
def _divmod(num, den, p):
    """Compute num / den modulo prime p

    To explain this, the result will be such that: 
    den * _divmod(num, den, p) % p == num
    """
    inv, _ = _extended_gcd(den, p)
    return num * inv
# แก้รหัสโดย ค่าที่ได้มาจาก เลขที่ได้หารกับค่าโมดูลัส  + 
def _lagrange_interpolate(x, x_s, y_s, p):
    """
    Find the y-value for the given x, given n (x, y) points;
    k points will define a polynomial of up to kth order.
    """
    k = len(x_s)
    assert k == len(set(x_s)), "points must be distinct"
    def PI(vals):  # upper-case PI -- product of inputs
        accum = 1
        for v in vals:
            accum *= v
        return accum
    nums = []  # avoid inexact division
    dens = []
    for i in range(k):
        others = list(x_s)
        cur = others.pop(i)
        nums.append(PI(x - o for o in others))
        dens.append(PI(cur - o for o in others))
    den = PI(dens)
    num = sum([_divmod(nums[i] * den * y_s[i] % p, dens[i], p)
               for i in range(k)])
    return (_divmod(num, den, p) + p) % p
_PRIME = 1667
def recover_secret(shares, prime=_PRIME):
    """
    Recover the secret from share points
    (points (x,y) on the polynomial).
    """
    if len(shares) < 2:
        raise ValueError("need at least three shares")
    x_s, y_s = zip(*shares)
    return _lagrange_interpolate(0, x_s, y_s, prime)



def main():
    minimum = int(input("minimum : "));
    shares = []
    for i in range(minimum):
        user_input = input();
        shares.append(tuple(int(item) for item in user_input.split(",")));
    print('Secret recovered from minimum subset of shares:             ',
          recover_secret(shares))

if __name__ == '__main__':
    main()