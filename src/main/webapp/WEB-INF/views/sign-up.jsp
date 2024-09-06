<!DOCTYPE html>
<html lang="en">
<head>
  <title>Sign-up</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <link rel="stylesheet" href="static/css/styling/sign-up.css" />
</head>
<body>
  <div class="container-fluid d-flex flex-row full-height">
    <div class="col-md-6 d-none d-md-flex justify-content-center align-items-center p-0">
      <img src="static/Photos/test2.png" class="custom-img img-fluid rounded-3" alt="background"/>
    </div>
    <div class="col-md-6 col-s-12 col-xs-12 d-flex flex-column justify-content-center align-items-center bg-overlay">
      <div class="text-start w-100 px-4 px-md-0" style="max-width: 400px">
        <h2>Sign Up</h2>
        <p class="fs-6 text-secondary mb-5">
          Enter your email and password to register
        </p>
        <form id="signupForm">
          <div class="mb-3 mt-5">
            <input type="text" class="form-control fw-lighter" id="username" placeholder="Username" required/>
          </div>
          <div class="mb-3">
            <input type="email" class="form-control fw-lighter" id="email" placeholder="Email" required/>
          </div>
          <div class="mb-3">
            <input type="password" class="form-control fw-lighter" id="password" placeholder="Password" required/>
          </div>
          <div class="form-check mb-3">
            <input class="form-check-input custom-label" type="checkbox" id="terms" required/>
            <label class="form-check-label" for="terms">
              <p class="fs-6 text-secondary">
                I agree to the <a href="/LiveHelp/terms-and-conditions" class="a-custom text-dark fw-semibold">Terms and Conditions</a>
              </p>
            </label>
          </div>
          <button type="submit" class="btn btn-lg w-100 bg-color-custom btn-opacity text-white">Sign Up</button>
        </form>
        <p class="mt-3 text-center">
          Already have an account? <a href="/LiveHelp/login" class="a-custom color-custom">Sign In</a>
        </p>
      </div>
    </div>
    <footer class="footer d-flex flex-row justify-content-around">
      <div class="d-flex align-items-center">
        <span class="text-muted">&copy; 2024 HelpDesk. All rights reserved.</span>
      </div>
      <div class="d-flex align-items-center">
        <p class="mb-2 me-3"><a href="/LiveHelp/about-us" class="text-secondary a-custom">About us</a></p>
        <p class="mb-2"><a href="/LiveHelp/terms-and-conditions" class="text-secondary a-custom">Terms and Conditions</a></p>
      </div>
    </footer>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
    $(document).ready(function() {
      $("#signupForm").on("submit", function(event) {
        event.preventDefault(); // Prevent default form submission

        // Get form data
        var username = $('#username').val();
        var email = $('#email').val();
        var password = $('#password').val();

        // Perform POST request
        $.ajax({
        	  url: "/LiveHelp/rest/utilizator/insert", // Adjust `myApp` with your actual context path
        	  type: "POST",
        	  contentType: "application/json",
        	  data: JSON.stringify({ username: username, email: email, parola: password }),
        	  success: function(response) {
        	    alert("Sign-up successful! Redirecting to login page...");
        	    window.location.href = "/LiveHelp/login"; // Redirect to login page
        	  },
        	  error: function(xhr, status, error) {
        	    alert("Error: " + (xhr.responseText || "Sign-up failed. Please try again."));
        	  }
        	});
      });
    });
  </script>
</body>
</html>
