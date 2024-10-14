<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center mt-5">
			<div class="col-md-6">
				<div class="card shadow-lg">
					<div class="card-header text-center">
						<h3>Login</h3>
					</div>
					<div class="card-body">
						<form action="${pageContext.request.contextPath}/login"
							method="post" class="needs-validation" novalidate>
							<div class="mb-3">
								<label for="email" class="form-label">Email</label> <input
									type="email" class="form-control" id="email" name="email"
									required>
								<div class="invalid-feedback">Please enter a valid email
									address.</div>
							</div>
							<div class="mb-3">
								<label for="password" class="form-label">Password</label> <input
									type="password" class="form-control" id="password"
									name="password" required>
								<div class="invalid-feedback">Please enter your password.</div>
							</div>
							<p align="center" style="color: red;">${error}</p>
							<div class="form-check mb-3">
								<input class="form-check-input" type="checkbox" id="rememberMe"
									name="rememberMe"> <label class="form-check-label"
									for="rememberMe">Remember Me</label>
							</div>
							<div class="d-grid mb-3">
								<button type="submit" class="btn btn-primary">Login</button>
							</div>
							<div class="text-center">
								<p>
									Don't have an account? <a
										href="${pageContext.request.contextPath}/register">Register
										here</a>
								</p>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
		// Bootstrap 5 form validation
		(function() {
			'use strict'

			var forms = document.querySelectorAll('.needs-validation')

			Array.prototype.slice.call(forms).forEach(function(form) {
				form.addEventListener('submit', function(event) {
					if (!form.checkValidity()) {
						event.preventDefault()
						event.stopPropagation()
					}
					form.classList.add('was-validated')
				}, false)
			})
		})()
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
