package br.pucrs;

public class Multi {

    public long multiply(long x, long y, int n) {

        if (n == 1) {
            return x * y;
        } else {
            int m = n/2;

            long a = (long) (x/(Math.pow(2,m)));
            long b = x & ((1L << m) - 1);
            long c = y >> m;
            long d = y & ((1L << m) - 1);

            long e = multiply(a, c, m);
            long f = multiply(b, d, m);
            long g = multiply(b, c, m);
            long h = multiply(a, d, m);

            return (e << (2  m)) + ((g + h) << m) + f;
        }
    }
}
/*
MULTIPLY(x, y, n)
     IF (n = 1)
        RETURN x * y.
     ELSE
        m ← ⎡ n / 2 ⎤.
        a ← ⎣ x / 2^m ⎦;
        b ← x mod 2^m.
        c ← ⎣ y / 2^m ⎦;
        d ← y mod 2^m.
        e ← MULTIPLY(a, c, m).
        f ← MULTIPLY(b, d, m).
        g ← MULTIPLY(b, c, m).
        h ← MULTIPLY(a, d, m).
        RETURN 2^(2m)*e + 2^m*(g + h) + f.
 */