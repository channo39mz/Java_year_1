from __future__ import division
from __future__ import print_function
import random
import functools
_PRIME = 1667
_RINT = functools.partial(random.SystemRandom().randint, 0)
def _eval_at(poly, x, prime):
    """Evaluates polynomial (coefficient tuple) at x, used to generate a
    shamir pool in make_random_shares below.
    """

    accum = 0
    for coeff in reversed(poly):
        accum *= x
        accum += coeff
        accum %= prime
    return accum
# สร้างตัวเลขที่จะแชร์ โดยถ้าจำนวนคนที่ต้องรู้เพื่อแก้รหัสน้อยกว่าจำนวนที่แชร์ error
# ถ้าคนรับมีเท่ากันจำนวนเลขทาี่สุ่มมาจะ นำเลข รหัสลับ + ผลรวมจำนวนเฉพาะแบบสุ่มในของเขต  2 ^ 127
# แยกส่วนของความลับเป็นส่วนๆตาม แล้วแบ่งให้คนรับแต่ละคน
def make_random_shares(secret, minimum, shares, prime=_PRIME):
    """
    Generates a random shamir pool for a given secret, returns share points.
    """
    if minimum > shares:
        raise ValueError("Pool secret would be irrecoverable.")
    poly = [secret] + [_RINT(prime - 1) for i in range(minimum - 1)]
    print(poly)
    points = [(i, _eval_at(poly, i, prime))
              for i in range(1, shares + 1)]
    return points
def main():
    """Main function"""
    secret = int(input())
    # secret = 9999
    shares = make_random_shares(secret, minimum=int(input()), shares=int(input()))
    print(shares)
    print('Secret:                                                     ',
          secret)
    print('Shares:')
    if shares:
        for share in shares:
            print('  ', share)
if __name__ == '__main__':
    main()