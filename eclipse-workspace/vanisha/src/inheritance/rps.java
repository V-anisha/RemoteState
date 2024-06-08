package inheritance;
class university1

{

String course="BCA";

}

class college1 extends university1

{

String course="BDA";

void printcourse()

{

System.out.println(course);

System.out.println(super.course);

}

}

class super1{

public static void main(String args[])

{

college1 d=new college1();

d.printcourse();

}}