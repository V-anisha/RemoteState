package inheritance;

class campus{

void course()

{System.out.println("BCA running");}

}

class christ extends campus{

void course(){System.out.println("BDA running");}

void subjects(){System.out.println("Object Oriented Programming using java");}

void study(){

super.course();

course();

subjects();

}

}

class super2{

public static void main(String args[]){

christ obj=new christ();

obj.study();

}}