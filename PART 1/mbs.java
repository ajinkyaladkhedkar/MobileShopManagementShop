
import java.io.InputStreamReader;
import java.util.Scanner;

class product{ 
public String bname;
public float mpix;
public long imei;
public String mno;
Scanner w=new Scanner(new InputStreamReader(System.in));
void add()
{
System.out.println("Enter the brand name:");
bname=w.next();
System.out.println("Enter the model no:");
mno=w.next();
System.out.println("Enter the Camera Megapixel:");
mpix=w.nextFloat();
System.out.println("Enter the IMEI no.:");
imei=w.nextLong();
}
void modify()
{
	System.out.println("Enter the new values--");
	System.out.println("Enter the brand name:");
	bname=w.next();
	System.out.println("Enter the model no:");
	mno=w.next();
	System.out.println("Enter the Camera Megapixel:");
	mpix=w.nextFloat();
	System.out.println("Enter the IMEI no.:");
	imei=w.nextLong();
}




long im()
{
return imei;
}

public String toString()
{
 return "Brand Name"+bname+" Model no. "+mno+" Camera Megapixel "+mpix+" IMEI "+imei;
}
}

public class mbs {
	
	
	
	int u=0;
	
	
	public static void main(String[] args){
		int ch;
		product[] p;
int j=0;
int i=0;
int k=0;
		p=new product[20];
		for(int u=0;u<20;u++)
		p[u]=new product();
Scanner w=new Scanner(new InputStreamReader(System.in));
		do{
	
System.out.println("=================================");
System.out.println("1.Add new product");
System.out.println("2.Modify product");
System.out.println("3.Delete product");
System.out.println("4.Search product");
System.out.println("5.Display product");
System.out.println("6.Exit");
Scanner s=new Scanner(new InputStreamReader(System.in));
int z;
z=s.nextInt();
switch(z)
{
case 1:
	p[i++].add();
	break;
case 2:
	long im;
		int index;
	 System.out.println("Enter the IMEI no. of product");
	 im=w.nextLong();
	for(j=0;j<i;j++)
		{
			if(p[j].im()==im)
			break;
		}
	 
	 if(j==i)
		 System.out.println("Product not found");
	p[j].modify();
	break;
case 3: 
	 System.out.println("Enter the IMEI no. of product");
	 im=w.nextLong();
	for(j=0;j<i;j++)
		{
			if(p[j].im()==im)
			break;
		}
	for(k=j;k<i-1;k++)
	p[k+1]=p[k];
	break;
case 4:
	System.out.println("Enter the IMEI no. of product");
	 im=w.nextLong();
	for(j=0;j<i;j++)
		{
			if(p[j].im()==im)
				break;
		}
	 if(j==i)
		 System.out.println("Product not found");
	System.out.println(p[j]);
	break;
case 5:
	for(k=0;k<i;k++)
	System.out.println(p[k]);
	break;
case 6:
	System.exit(0);
	break;
	default:
		System.out.println("Invalid Choice !!!");
		break;
	
}
System.out.println("Do you want to continue(1.y/2.n)");
ch=s.nextInt();
		}while(ch==1);
		System.out.println("---Thank you---");
}
	

}

/* Output:
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
1
Enter the brand name:
APPLE
Enter the model no:
5
Enter the Camera Megapixel:
8
Enter the IMEI no.:
12345678
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
1
Enter the brand name:
NOKIA
Enter the model no:
5230
Enter the Camera Megapixel:
2
Enter the IMEI no.:
87654321
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
5
Brand NameAPPLE Model no. 5 Camera Megapixel 8.0 IMEI 12345678
Brand NameNOKIA Model no. 5230 Camera Megapixel 2.0 IMEI 87654321
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
2
Enter the IMEI no. of product
12345678
Enter the new values--
Enter the brand name:
SAMSUNG
Enter the model no:
3400
Enter the Camera Megapixel:
4
Enter the IMEI no.:
222333444
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
5
Brand NameSAMSUNG Model no. 3400 Camera Megapixel 4.0 IMEI 222333444
Brand NameNOKIA Model no. 5230 Camera Megapixel 2.0 IMEI 87654321
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
4
Enter the IMEI no. of product
87654321
Brand NameNOKIA Model no. 5230 Camera Megapixel 2.0 IMEI 87654321
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
5
Brand NameSAMSUNG Model no. 3400 Camera Megapixel 4.0 IMEI 222333444
Brand NameNOKIA Model no. 5230 Camera Megapixel 2.0 IMEI 87654321
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
3
Enter the IMEI no. of product
222333444
Do you want to continue(1.y/2.n)
1
=================================
1.Add new product
2.Modify product
3.Delete product
4.Search product
5.Display product
6.Exit
5
Brand NameNOKIA Model no. 5230 Camera Megapixel 2.0 IMEI 87654321
Do you want to continue(1.y/2.n)
2
---Thank you---

*/
