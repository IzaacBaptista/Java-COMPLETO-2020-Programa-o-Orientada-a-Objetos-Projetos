public class ProcessamentoDeDados {

    public static void main(String[] args) {
        
        int x, y;
        double z;

        x = 5;
        y = 2 * 5;
        z = x + y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        /************************************************/

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        /************************************************/

        float a, A, H, areas;

        a = 6f;
        A = 8f;
        H = 5f;

        areas = (float) ((a + A) / 2f * h);

        System.out.println(areas);

        /************************************************/
        
        int c, d;
        double resultado;

        c = 5;
        d = 2;

        resultado = c / d;

        System.out.println(resultado);

        /************************************************/
        
        double C, D;
        double resposta;

        C = 5;
        D = 2;

        resposta = C / D;

        System.out.println(resposta);

        /************************************************/

        double g;
        int t;

        g = 5.0;
        t = (int)g;

        System.out.println(t);

    }
    
}
