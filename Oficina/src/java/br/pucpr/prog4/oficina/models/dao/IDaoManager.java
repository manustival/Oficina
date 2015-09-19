package br.pucpr.prog4.oficina.models.dao;

public interface IDaoManager 
{
    void iniciar() throws DaoException;
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
    
    VeiculoDAO getVeiculoDAO();
    
    
    
    
}