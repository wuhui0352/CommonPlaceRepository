package com.pattern;

public class InnerStyle {
  private static class SingletonHolder{
      private static InnerStyle instance = new InnerStyle();
  }
    private InnerStyle(){
    }
    public static InnerStyle getInstance() {
        return SingletonHolder.instance;
    }
}
