/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pepe.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Windows 8
 */
@Embeddable
public class UsuarioHasFichaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ficha")
    private int idFicha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_instructor")
    private int idTipoInstructor;

    public UsuarioHasFichaPK() {
    }

    public UsuarioHasFichaPK(int idUsuario, int idFicha, int idTipoInstructor) {
        this.idUsuario = idUsuario;
        this.idFicha = idFicha;
        this.idTipoInstructor = idTipoInstructor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public int getIdTipoInstructor() {
        return idTipoInstructor;
    }

    public void setIdTipoInstructor(int idTipoInstructor) {
        this.idTipoInstructor = idTipoInstructor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUsuario;
        hash += (int) idFicha;
        hash += (int) idTipoInstructor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioHasFichaPK)) {
            return false;
        }
        UsuarioHasFichaPK other = (UsuarioHasFichaPK) object;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.idFicha != other.idFicha) {
            return false;
        }
        if (this.idTipoInstructor != other.idTipoInstructor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pepe.jpa.entities.UsuarioHasFichaPK[ idUsuario=" + idUsuario + ", idFicha=" + idFicha + ", idTipoInstructor=" + idTipoInstructor + " ]";
    }
    
}
