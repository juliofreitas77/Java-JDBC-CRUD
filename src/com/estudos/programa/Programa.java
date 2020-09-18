package com.estudos.programa;

import com.estudos.dao.ClienteDao;
import com.estudos.model.Cliente;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Cliente cliente = new Cliente();

        cliente.setCpfCliente("11111111111");
        cliente.setEnderecoCliente("Av Joao Pessoa, 44888");

        ClienteDao clienteDao = new ClienteDao();
        clienteDao.atualizaEndereco(cliente);
    }
}
