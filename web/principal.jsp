<%-- 
    Document   : principal
    Created on : 28/11/2016, 02:34:26 PM
    Author     : juand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Coordinación Salas</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
                <script src="http://code.jquery.com/jquery-latest.js"></script>
                <script type="text/javascript" src="js/login.js"></script>
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
	<body class="homepage">
		<div id="page-wrapper">

			<!-- Header -->
				<div id="header-wrapper">
					<header id="header" class="container">

						<!-- Logo -->
							<div id="logo">
								<h1><a href="index.html">CoordiSalas</a></h1>
								<span>Facultad de Ingenierias</span>
                                                                <p>Bienvenido ${sessionScope.usuario}</p>
							</div>

						<!-- Nav -->
							<nav id="nav">
								<ul>
									<li class="current"><a href="principal.jsp">Inicio</a></li>
									<li>
										<a href="#">Salas</a>
										<ul>
											<li><a href="#" id="addSala">Adicionar</a></li>
											<li><a href="#">Consultar, Eliminar, Editar</a></li>
											<li>
												<a href="#">Reservar</a>
												<ul>
													<li><a href="#">Cambiar Reserva</a></li>
													<li><a href="#">Ocupar Sala</a></li>
													<li><a href="#">Desocupar Sala</a></li>
													</ul>
											</li>
											
										</ul>
									</li>
									<li>
										<a href="#">Profesores</a>
										<ul>
											<li><a href="#">Adicionar</a></li>
											<li><a href="#">Consultar, Eliminar, Editar</a></li>
											<li>
												<a href="#">Consultar Salas Reservadas</a>
											</li>
											
										</ul>
									</li>
									<li>
										<a href="#">Monitores</a>
										<ul>
											<li><a href="#">Adicionar</a></li>
											<li><a href="#">Consultar, Eliminar, Editar</a></li>
											<li>
												<a href="#">Borrar Todos</a>
											</li>
											
										</ul>
									</li>
                                                                        <li>
										<a href="login?n=1">Cerrar Sesión</a>
										
									</li>
								</ul>
							</nav>

					</header>
				</div>

			


			<!-- Main -->
				<div id="main-wrapper">
					<div class="container">
						<div class="row 200%">
					
							<div class="8u 12u(medium) important(medium)">

								<!-- Content -->
									<div id="content">
										<section class="last">
											<h2>Estado de Salas</h2>
											<p>La idea es que se cargue la tabla con el estado actual de las salas</p>
										</section>
									</div>

							</div>
						</div>
					</div>
				</div>

			<!-- Footer -->
				<div id="footer-wrapper">
					<footer id="footer" class="container">
						<div class="row">
							<div class="3u 6u(medium) 12u$(small)">

								<!-- Links -->
									<section class="widget links">
										<h3>Informacion General</h3>
										<ul class="style2">
											<li><a>Asamblea 26 de noviembre</a></li>
										</ul>
									</section>

							</div>
							<div class="3u 6u$(medium) 12u$(small)">

								<!-- Links -->
									<section class="widget links">
										<h3>Monitorias</h3>
										<ul class="style2">
											<li><a href="#">Programacion 3 Sala H 2 pm</a></li>
										</ul>
									</section>

							</div>
						
							<div class="3u 6u$(medium) 12u$(small)">

								<!-- Contact -->
									<section class="widget contact last">
										<h3>Contacto</h3>
										<ul>
											<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
											<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
										</ul>
										<p>Martha Helena Loaiza,
                                        Rodrigo Andres Cardenas.<br />
										Tel: 8781500 ext. 13657<br />
										E-mail: coordisalas@ucaldas.edu.co</p>
									</section>

							</div>
						</div>
						<div class="row">
							<div class="12u">
								<div id="copyright">
									<ul class="menu">
										<li>&copy; Universidad de Caldas. All rights reserved</li><li><a >Ingenieria de Software II </a></li>
									</ul>
								</div>
							</div>
						</div>
					</footer>
				</div>

			</div>

		<!-- Scripts -->

			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>
