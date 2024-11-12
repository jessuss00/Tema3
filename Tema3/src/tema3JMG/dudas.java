package tema3JMG;

public class dudas {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int numero=65675;
		for(int i=numero;i>0; i=i/10) {
			int digito =i%10;
			System.out.println(digito);
		}
	}

}
