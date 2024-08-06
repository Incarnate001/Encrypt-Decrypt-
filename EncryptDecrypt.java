import java.util.Scanner;

public class EncryptDecrypt 

{

    public static void main(String args[])

    {

        System.out.println("Welcome to Encryption Decryption Corporation");

        System.out.println("Select One of the following options :");

        System.out.println("1 - Encrypt a Message ");

        System.out.println("2 - Decrypt a Message ");

        Scanner in = new Scanner(System.in);

        int inp1 = in.nextInt();

        switch (inp1) {

            case 1:

            System.out.println("Welcome to Encryption Window");

            System.out.print("Enter the Sentence to encrypt. To stop Encrypting type #codetermination001\n>");

            encrypt();

            break;

            case 2:

            System.out.println("Welcome to Decryption Window");

            System.out.print("Enter the Encrypted Sentence. To stop Decrypting type #codetermination001\n>");

            decrypt();

            break;

            default:

            System.out.println("Wrong Option");

            break;

        }

        in.close();

    }

    public static void encrypt()

    {

        String Enc="";char ch;int b;

        Scanner sc = new Scanner(System.in);

        String inp = sc.nextLine();

        while(inp.equalsIgnoreCase("#codetermination001")==false)

        {

            int a = (int)(10*Math.random())+1;

            for(int i=0;i<inp.length();i++)

            {

                ch=inp.charAt(i);

                b=(int)ch;

                b+=a;

                ch=(char)b;

                Enc=Enc+ch;;

            }

            b=64+a;

            ch=(char)b;

            Enc=Enc+ch;

            System.out.println("Encrypted Text :" + Enc);

            Enc="";

            System.out.print("> ");

            inp=sc.nextLine();

        }   

        sc.close(); 

    }

    public static void decrypt()

    {

        String Dec="";char ch;int b;

        Scanner ab = new Scanner(System.in);

        String inp = ab.nextLine();

        while(inp.equalsIgnoreCase("#codetermination001")==false)

        {

            ch=inp.charAt(inp.length()-1);

            int a = (int)ch-64;

            for(int i=0;i<inp.length()-1;i++)

            {

                ch=inp.charAt(i);

                b=(int)ch;

                b-=a;

                ch=(char)b;

                Dec=Dec+ch;;

            }

            System.out.println("Encrypted Text :" + Dec);

            Dec="";

            System.out.print("> ");

            inp=ab.nextLine();

        }   

        ab.close(); 

    }

}
