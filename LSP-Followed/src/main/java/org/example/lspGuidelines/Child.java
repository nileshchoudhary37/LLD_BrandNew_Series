package org.example.lspGuidelines;

public class Child extends Parent{
    @Override
    public void solve(String agr){
        System.out.println("Solving from child with agr: "+agr);
    }
}
