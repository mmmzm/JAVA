
public class R05_CommandLine {

	public static void main(String[] args) {
		//
        // 13 + 15 -> 28
		
		System.out.println("args.length:"+args.length);
		
		for(int i=0;i<args.length;i++) {
			System.out.printf("args[%d]=%s%n",i,args[i]);
		}
		
		
		if(args.length !=3 ) {
			System.out.println("Programe exit(input : 13 + 15) ");
			System.exit(0);//Programe exit
		}
		
		
		int num01 = Integer.parseInt(args[0]);//"13" -> 13
		char op   = args[1].charAt(0);        //"+" -> '+'
		int num02 = Integer.parseInt(args[2]);//"15" -> 15
		
		int result= 0; //
		
		switch (op) {
		case '+':
			result  = num01+num02;
			break;
		case '-':
			result  = num01-num02;
			break;	
			
		case '*':
			result  = num01*num02;
			break;			
		case '/':
			result  = num01/num02;
			break;
			
			
		default:
			System.out.println("operator check!");
			break;
		}
		
		System.out.println("result:"+result);
		
		
		
		
		
	}

}
//D:\JAP_20249311\01_JAVA\WORKSPACE\J10\src>java R05_CommandLine 13 + 15
//args.length:3
//args[0]=13
//args[1]=+
//args[2]=15
//result:28
