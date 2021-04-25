package tugasminggu7;

 /**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */

class A {
    void callThis() {
        System.out.println("Inside Class A's Method!");
    }
}
class B extends A{
    @Override
    void callThis() {
        System.out.println("Inside Class B's Method!");
    }
}
class C extends A{
    @Override
    void callThis() {
        System.out.println("Inside Class C's Method!");
    }
} 
class DynamicDispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        
        ref = b;
        ref.callThis();
        
        ref = c;
        ref.callThis();
        
        ref = a;
        ref.callThis();
    }
}