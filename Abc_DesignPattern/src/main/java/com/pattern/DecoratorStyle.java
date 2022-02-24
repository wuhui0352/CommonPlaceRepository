package com.pattern;

public class DecoratorStyle {
    interface Source{
        void method();
    }


    public class Decorator implements Source{

        private Source source ;
        public void decotate1(){
            System.out.println("decorate");
        }
        @Override
        public void method() {
            decotate1();
            source.method();
        }

    }
}
