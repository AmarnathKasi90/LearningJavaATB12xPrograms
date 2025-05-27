package ex_25_OOPs_Abstraction_Interface;

public class Lab216_Interview {
}

interface I11{}
interface I12{}
class A1{}
class B1{}
abstract class Amarnath{
    abstract void rk();
    void display(){}
    abstract void ark();
}
class Test1 extends A1{}
//class Test2 extends A1,B1{} // Multiple Inheritance in class is not allowed
class Test3 implements I11{}
class Test4 implements I12,I11{}
class Test5 extends A1 implements I11,I12{}
//class Test6 implements I11 extends A1{}
//interface I3 extends A1{}
interface I3{}