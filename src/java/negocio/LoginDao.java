/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.HibernateUsuarioDao;
import bean.Usuario;

/**
 *
 * @author Pc-Victor
 */
public class LoginDao {
	public String authenticateUser(Usuario usuario){
		
		HibernateUsuarioDao usuarioDao = new HibernateUsuarioDao();
		
		Usuario u = usuarioDao.selectById(usuario.getUsuario());
		
		if (u != null) {
			if (u.getClave().contentEquals(usuario.getClave())) {
				return "SUCCESS";
			}
		}
		
		return "ERROR";
		
	}
}
