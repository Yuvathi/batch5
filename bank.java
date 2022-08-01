class bank
{
int accno;
String name;
Double bal;
bank()   
{
  accno =5034567878;
  name="yuvathi";
  bal=10,000;
}
bank(int actno,String n, Double balance)
{
    acc=actno;
    name=n;
    bal=balance;
}
void show()
{
system.out.println(accno+" "+name+" "+bal);
}
class main()
{
Public static void main(String arg[])
{
bank s1 = new bank();
s1.show();
bank s2 = new bank(587854728,"priya",11,000);
s2.show();
}
}