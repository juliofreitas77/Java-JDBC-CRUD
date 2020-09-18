package com.estudos.model;

import java.io.Serializable;
import java.sql.Date;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String cepCliente;
    private Date dataNascCliente;
    private String emailCliente;
    private String telefoneCliente;

    public Cliente() {
    }

    public Cliente(Integer id, String nomeCliente, String cpfCliente, String enderecoCliente, String bairroCliente,
                   String cidadeCliente, String cepCliente, Date dataNascCliente, String emailCliente, String telefoneCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.cepCliente = cepCliente;
        this.dataNascCliente = dataNascCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public void setDataNascCliente(Date data) {
        this.dataNascCliente = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public Date getDataNascCliente() {
        return dataNascCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente [");
        if (id != null) {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (nomeCliente != null) {
            builder.append("nomeCliente=");
            builder.append(nomeCliente);
            builder.append(", ");
        }
        if (cpfCliente != null) {
            builder.append("cpfCliente=");
            builder.append(cpfCliente);
            builder.append(", ");
        }
        if (enderecoCliente != null) {
            builder.append("enderecoCliente=");
            builder.append(enderecoCliente);
            builder.append(", ");
        }
        if (bairroCliente != null) {
            builder.append("bairroCliente=");
            builder.append(bairroCliente);
            builder.append(", ");
        }
        if (cidadeCliente != null) {
            builder.append("cidadeCliente=");
            builder.append(cidadeCliente);
            builder.append(", ");
        }
        if (cepCliente != null) {
            builder.append("cepCliente=");
            builder.append(cepCliente);
            builder.append(", ");
        }
        if (dataNascCliente != null) {
            builder.append("dataNascCliente=");
            builder.append(dataNascCliente);
            builder.append(", ");
        }
        if (emailCliente != null) {
            builder.append("emailCliente=");
            builder.append(emailCliente);
            builder.append(", ");
        }
        if (telefoneCliente != null) {
            builder.append("telefoneCliente=");
            builder.append(telefoneCliente);
        }
        builder.append("]");
        return builder.toString();
    }
}
