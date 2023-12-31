from math import pow


def catThing(h0, num_workers):
    while True:
        if h0 == num_workers == 0:
            break

        if h0 == num_workers:
            v1, v2 = 0, h0
        else:
            N = -1
            for k in range(1, 32):

                n = pow(num_workers, 1 / k)
                N = int(n)

                if N**k == num_workers:
                    if (N + 1) ** k == h0:
                        break
                elif (N + 1) ** k == num_workers:
                    if (N + 2) ** k == h0:
                        N = N + 1
                        break
                elif (N - 1) ** k == num_workers:
                    if (N) ** k == h0:
                        N = N - 1
                        break

            v1 = sum(N**i for i in range(k))
            v2 = sum((h0 // ((N + 1) ** i)) * (N) ** i for i in range(k + 1))

        return (v1, v2)


print((216, 125))
print(catThing(216, 125))
print((5764801, 1679616))
print(catThing(5764801, 1679616))