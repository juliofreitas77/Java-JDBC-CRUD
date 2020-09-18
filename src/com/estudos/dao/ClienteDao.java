package com.estudos.dao;

import com.estudos.model.Cliente;
import com.estudos.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {
    private Connection conn;

    public ClienteDao() {
        this.conn = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente) throws SQLException {
        String sql = "insert into clientes "
                + "(Nome_Cliente, CPF_Cliente, Endereco_Cliente, Bairro_Cliente, Cidade_Cliente, Cep_Cliente,"
                + "DataNasc_Cliente, Email_Cliente, Telefone_Cliente)" +
                " values (?,?,?,?,?,?,?,?,?)"; // place holder

        PreparedStatement stmt = conn.prepareStatement(sql);
        System.out.println("Conexão aberta!!!");

        try {
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getCpfCliente());
            stmt.setString(3, cliente.getEnderecoCliente());
            stmt.setString(4, cliente.getBairroCliente());
            stmt.setString(5, cliente.getCidadeCliente());
            stmt.setString(6, cliente.getCepCliente());
            stmt.setDate(7, cliente.getDataNascCliente());
            stmt.setString(8, cliente.getEmailCliente());
            stmt.setString(9, cliente.getTelefoneCliente());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            System.out.println("Conexão Finalizada!");
        }
    }

    public void atualizaEndereco(Cliente cliente){
        String sql = "UPDATE CLIENTES SET ENDERECO_CLIENTE=?" +
                "WHERE CPF_CLIENTE=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getEnderecoCliente());
            stmt.setString(2, cliente.getCpfCliente());

            int numLinhasAtualizadas =  stmt.executeUpdate();
            System.out.println("Qtde de registros atualizados: " + numLinhasAtualizadas);
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
