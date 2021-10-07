package com.mkl.mybaitis.session;


public interface Excutor {
 public <T> T query(String statement,Object parameter);  
}