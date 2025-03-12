import java.util.Scanner;
class Matrix_Turn_90 {
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int ary[][]= new int[3][3];
System.out.println("Enter the Elements");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
ary[i][j]=sc.nextInt();
}
}

int temp=ary[0][0];
for(int i=0;i<3;i++)
{
for(int j=i+1;j<3;j++)
{
temp=ary[i][j];
ary[i][j]=ary[j][i];
ary[j][i]=temp;
}
}

for (int i=0;i<3;i++)
{
for (int j=0;j<ary.length/2; j++)
{
int temp1 = ary[i][j];
ary[i][j]=ary[i][ary.length - j - 1];
ary[i][ary.length - j - 1] = temp1;
}
}


for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(ary[i][j]+" ");
}
System.out.println();
}

}

}