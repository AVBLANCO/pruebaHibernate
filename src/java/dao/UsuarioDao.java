/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import java.util.List;

/**
 *
 * @author Pc-Victor
 */
public interface UsuarioDao {
	public Usuario selectById(String usuario);

	public List<Usuario> selectAll();

	public void insert(Usuario usuario);
	
	public void update(Usuario usuario);

	public void delete(Usuario usuario);
}
