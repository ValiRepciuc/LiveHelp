<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login Page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <link rel="stylesheet" href="static/css/sign-in.css" />
</head>
<body>
  <div class="container d-flex justify-content-center align-items-center full-height">
    <div class="row bg-overlay" style="width: 50%">
      <div class="col-12 text-center rounded">
        <div class="container text-center fs-3 fw-semibold text-light px-4 py-5">
          Sign In
        </div>
        <div class="input-group input-group-sm mb-3 p-2">
          <input type="text" class="form-control fw-light" id="username" placeholder="Username" required/>
        </div>
        <div class="input-group input-group-sm mb-3 p-2">
          <input type="password" class="form-control fw-light" id="password" placeholder="Password" required/>
        </div>
        <div class="form-check mb-3 text-start justify-content-start align-items-start mx-2">
          <input class="form-check-input custom-label" type="checkbox" value="" id="rememberMe" />
          <label class="form-check-label text-start" for="rememberMe">
            <p class="fs-6 text-secondary">Remember me</p>
          </label>
        </div>
        <div class="p-2">
          <button id="loginBtn" class="btn btn-light btn-lg bg-color-custom btn-opacity">
            Login
          </button>
        </div>
        <div class="p-2 py-3">
          <p class="text-light">
            Don't have an account?
            <a href="/LiveHelp/sign-up" class="a-custom color-custom">Sign Up</a>
          </p>
        </div>
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
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
  $(document).ready(function() {
	  $("#loginBtn").click(function() {
	    // Clear local storage before attempting login
	    localStorage.clear();

	    var username = $('#username').val();
	    var password = $('#password').val();

	    // Fetch all users
	    $.get("/LiveHelp/rest/utilizator/getall", function(users) {
	      var foundUser = users.find(user => user.username === username && user.parola === password);
	      if (foundUser) {
	        // Store user ID in local storage
	        localStorage.setItem("id_utilizator", foundUser.id);

	        // Check if the user has a role
	        $.get("/LiveHelp/rest/rol/getbyid?id=" + foundUser.id, function(role) {
	          if (!role || !role.nume) {
	            // If no role found, assign "N/A"
	            $.ajax({
	              url: "/LiveHelp/rest/rol/insert",
	              type: "POST",
	              contentType: "application/json",
	              data: JSON.stringify({ id_utilizator: foundUser.id, nume: "N/A" }),
	              success: function() {
	                alert("Login successful and default role assigned! Redirecting to dashboard...");
	                window.location.href = "/LiveHelp/homepage"; // Redirect to dashboard
	              },
	              error: function(xhr, status, error) {
	                console.error("Role assignment failed:", error);
	                alert("An error occurred while assigning the default role. Please try again.");
	              }
	            });
	          } else {
	            // Role exists, proceed normally
	            window.location.href = "/LiveHelp/homepage"; // Redirect to dashboard
	          }
	        }).fail(function() {
	          alert("An error occurred while checking user role. Please try again.");
	        });
	      } else {
	        alert("Incorrect username or password. Please try again.");
	      }
	    }).fail(function() {
	      alert("An error occurred while processing your request. Please try again.");
	    });
	  });
	// Sidebar and other UI interactions
	  $(".sidebar ul li").on("click", function() {
	    $(".sidebar ul li.active").removeClass("active");
	    $(this).addClass("active");
	  });

	  $(".open-btn").on("click", function() {
	    $("#side_nav").addClass("active");
	  });

	  $(".close-btn").on("click", function() {
	    $("#side_nav").removeClass("active");
	  });
	});

  </script>
</body>
</html>
