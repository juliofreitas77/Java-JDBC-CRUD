package com.estudos.programa;


import com.estudos.dao.ClienteDao;
import com.estudos.model.Cliente;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

    public static void main(String[] args)  throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Maria Jose");
        cliente.setCepCliente("38400000");
        cliente.setCidadeCliente("Uberlandia");
        cliente.setCpfCliente("11111111111");
        cliente.setBairroCliente("centro");
        cliente.setDataNascCliente(new Date(sdf.parse("13/05/1970").getTime()));
        cliente.setEmailCliente("maria@gmail.com");
        cliente.setEnderecoCliente("Av dos tuiuius, 440");
        cliente.setTelefoneCliente("98888-4178");

        ClienteDao clienteDao = new ClienteDao();
        clienteDao.adiciona(cliente);
    }
}
