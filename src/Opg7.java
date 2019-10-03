public class Opg7 {
    public static void main(String[] args) {
        double tuition = 10000;
        System.out.println("Start tuition: "+tuition);
        for (int i = 0; i<10; i++){
            tuition = tuition*1.06;
        }
        System.out.println("Tuition price af 10 years with increase at 6% every year: "+tuition);
        double totalTuitionAfter10 = 0;
        for (int i = 0; i<4; i++){
            tuition = tuition*1.06;
            totalTuitionAfter10 += tuition;
        }
        System.out.println("4 years of worth of tuition after the 10 years: "+totalTuitionAfter10);
    }
}
