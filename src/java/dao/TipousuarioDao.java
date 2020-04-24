/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;

import bean.Tipousuario;

/**
 *
 * @author Pc-Victor
 */

public interface TipousuarioDao {
	public Tipousuario selectById(String tiposuario);

	public List<Tipousuario> selectAll();

	public void insert(Tipousuario tipousuario);
	
	public void update(Tipousuario tipousuario);

	public void delete(Tipousuario tipousuario);
}