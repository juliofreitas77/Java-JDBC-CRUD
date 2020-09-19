package com.estudos.programa;

import com.estudos.dao.ClienteDao;
import com.estudos.model.Cliente;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setId(7);
        clienteDao.deleteCliente(cliente);
    }
}
