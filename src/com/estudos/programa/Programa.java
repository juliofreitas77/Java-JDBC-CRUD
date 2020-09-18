package com.estudos.programa;

import com.estudos.dao.ClienteDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ClienteDao clienteDao = new ClienteDao();
        ResultSet rs = clienteDao.listarClientes();

        while (rs.next()) {
            System.out.println(rs.getInt("IDCLIENTE") + ", "
                    + rs.getString("Nome_cliente") + ", "
                    + rs.getString("CPF_CLIENTE") + ", "
                    + rs.getString("ENDERECO_CLIENTE") + ", "
                    + rs.getString("Bairro_Cliente") + ", "
                    + rs.getString("Cidade_Cliente"));
        }
    }
}
