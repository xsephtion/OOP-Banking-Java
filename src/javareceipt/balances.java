/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareceipt;

/**
 *
 * @author joseph
 */
public class balances {
    
    private static double balanceJonah;
    private static double sumbalanceJonah;
    private static double difbalanceJonah;
    private static double balanceGer;
    private static double sumbalanceGer;
     private static double difbalanceGer;
    private static double balanceSeph;
    private static double sumbalanceSeph;
     private static double difbalanceSeph;
    private static double balanceXav;
    private static double sumbalanceXav;
     private static double difbalanceXav;
    private static double balancePatF;
    private static double sumbalancePatF;
     private static double difbalancePatF;
    private static double balanceBrends;
    private static double sumbalanceBrends;
     private static double difbalanceBrends;
    private static double balancePatC;
    private static double sumbalancePatC;
     private static double difbalancePatC;
    
    public balances(){}
    
    public balances(double sum){
        this.balanceJonah = 49000;
        this.sumbalanceJonah = sum;
        this.difbalanceJonah = sum;
        this.balanceGer    = 41000;
        this.sumbalanceGer = sum;
        this.difbalanceGer = sum;
        this.balanceSeph   = 90000;
        this.sumbalanceSeph = sum;
        this.difbalanceSeph = sum;
        this.balanceXav    = 80000;
        this.sumbalanceXav = sum;
        this.difbalanceXav = sum;
        this.balancePatF   = 23411;
        this.sumbalancePatF = sum;
        this.difbalancePatF = sum;
        this.balanceBrends = 60000;
        this.sumbalanceBrends = sum;
        this.difbalanceBrends = sum;
        this.balancePatC   = 100000;
        this.sumbalancePatC = sum;
        this.difbalancePatC = sum;
    }
    
    
    public double getBalanceJonah(){
        return sumbalanceJonah;
    }
    public double getBalanceGer(){
        return sumbalanceGer;
    }
    public double getBalanceSeph(){
        return sumbalanceSeph;
    }
    public double getBalanceXav(){
        return sumbalanceXav;
    }
    public double getBalancePatF(){
        return sumbalancePatF;
    }
    public double getBalanceBrends(){
        return sumbalanceBrends;
    }
    public double getBalancePatC(){
        return sumbalancePatC;
    }
    public double getDifBalanceJonah(){
        return difbalanceJonah;
    }
    public double getDifBalanceGer(){
        return difbalanceGer;
    }
    public double getDifBalanceSeph(){
        return difbalanceSeph;
    }
    public double getDifBalanceXav(){
        return difbalanceXav;
    }
    public double getDifBalancePatF(){
        return difbalancePatF;
    }
    public double getDifBalanceBrends(){
        return difbalanceBrends;
    }
    public double getDifBalancePatC(){
        return difbalancePatC;
    }
    
    
    public void setBalanceJonah(double bal){
        balanceJonah  = 49000;
        sumbalanceJonah = balanceJonah + bal;
    }
    public void setBalanceGer(double bal){
        balanceGer    = 41000;
        sumbalanceGer = balanceGer + bal;
    }
    public void setBalanceSeph(double bal){
        balanceSeph   = 90000;
        sumbalanceSeph = balanceSeph + bal;
    }
    public void setBalanceXav(double bal){
        balanceXav    = 80000;
        sumbalanceXav = balanceXav + bal;
    }
    public void setBalancePatF(double bal){
        balancePatF   = 23411;
        sumbalancePatF = balancePatF + bal;
    }
    public void setBalanceBrends(double bal){
        balanceBrends = 60000;
        sumbalanceBrends = balanceBrends + bal;
    }
    public void setBalancePatC(double bal){
        balancePatC   = 100000;
        sumbalancePatC = balancePatC + bal;
    }
    
    public void setDifBalanceJonah(double bal){
        difbalanceJonah = bal;
    }
    public void setDifBalanceGer(double bal){
        difbalanceGer =  bal;
    }
    public void setDifBalanceSeph(double bal){
        difbalanceSeph = bal;
    }
    public void setDifBalanceXav(double bal){
        difbalanceXav =  bal;
    }
    public void setDifBalanceBrends(double bal){
        difbalanceBrends = bal;
    }
    public void setDifBalancePatF(double bal){
        difbalancePatF = bal;
    }
    public void setDifBalancePatC(double bal){
        difbalancePatC = bal;
    }
    
    
}
