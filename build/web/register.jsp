<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>REgistro de Usuario</title>
</head>
<body>
<h1>Registro de Usuario</h1>

<form action="RegisterServlet" method="post">

    <div class="form-group"> <!-- Full Name -->
        <label for="usuario" class="control-label">Usuario</label>
        <input type="text" class="form-control" id="usuario" name="usuario" placeholder="crangarita">
    </div>  
    
    <div class="form-group"> <!-- Street 1 -->
        <label for="tipo" class="control-label">Tipo</label>
        <select class="form-control" id="tipo" name="tipo" >
        	<option value="1">Administrador</option>
        	<option value="2">Normal</option>
        </select>
    </div>    

    <div class="form-group"> <!-- Street 1 -->
        <label for="clave" class="control-label">Clave</label>
        <input type="password" class="form-control" id="clave" name="clave" placeholder="Utilizar letras mayusculas, minusculas, numeros y simbolos">
    </div>                    
                            
    <div class="form-group"> <!-- Street 2 -->
        <label for="nombre" class="control-label">Nombre</label>
        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Carlos Rene Angarita Sanguino">
    </div>    

    <div class="form-group"> <!-- City-->
        <label for="email" class="control-label">Email</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="crangarita@servidor.com">
    </div>                                    
    
    <div class="form-group"> <!-- Zip Code-->
        <label for="direccion" class="control-label">Direccion</label>
        <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Av 13 N 12-34">
    </div> 
    
    <div class="form-group"> <!-- Zip Code-->
        <label for="telefono" class="control-label">Teléfono</label>
        <input type="text" class="form-control" id="telefono" name="telefono" placeholder="3138776936">
    </div>        
    
    <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Registrarse</button>
    </div>     
    
</form>

</body>
</html>