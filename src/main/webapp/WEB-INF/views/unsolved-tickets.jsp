<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Solved Tickets</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
  <link rel="stylesheet" href="static/css/styling/admin-tickets.css" />
  <link rel="stylesheet" href="static/css/styling/your-tickets.css" />
  <link rel="stylesheet" href="static/css/styling/sidebar.css" />
  <link rel="stylesheet" href="static/css/styling/navbar.css" />
  <link rel="stylesheet" href="static/css/styling/footer.css" />
  <style>
  </style>
</head>
<body>
   <div class="main-container d-flex padding-media">
      <div
        class="sidebar sidebar-custom-color my-3 p-1 rounded-4"
        id="side_nav"
      >
        <div
          class="header-box px-2 pt-4 pb-4 d-flex justify-content-center align-items-center text-center"
        >
          <h1 class="fs-5 text">
            <span class="text-white">HelpDesk Dashboard</span>
          </h1>
          <button class="btn d-md-none d-block close-btn px-1 py-0 text-white">
            <i class="fas fa-times"></i>
          </button>
        </div>
        <div class="d-flex flex-column" style="height: 74%">
          <div>
            <ul class="list-unstyled px-2 pt-4 text-start">
              <li class="">
                <a href="/LiveHelp/homepage" class="text-decoration-none px-3 py-2 d-block fw-lighter">
                  <i class="fa-solid fa-chart-line me-3"></i>Dashboard
                </a>
              </li>
              <li class="">
                <a href="/LiveHelp/your-tickets" class="text-decoration-none px-3 py-2 d-block fw-lighter">
                  <i class="fa-regular fa-user me-3"></i>Your Tickets
                </a>
              </li>
              <li class="">
                <a href="/LiveHelp/tickets-to-solve" class="text-decoration-none px-3 py-2 d-block d-flex justify-content-between fw-lighter">
                  <span><i class="fa-solid fa-ticket me-3"></i>Tickets to Solve</span>
                </a>
              </li>
              <li class="">
                <a href="/LiveHelp/history" class="text-decoration-none px-3 py-2 d-block fw-lighter">
                  <i class="fa-solid fa-clock-rotate-left me-3"></i>History
                </a>
              </li>
              <li class="">
                <a href="/LiveHelp/users" class="text-decoration-none px-3 py-2 d-block fw-lighter">
                  <i class="fa-solid fa-users me-3"></i>Users
                </a>
              </li>
              <li class="">
                <a href="/LiveHelp/about-us" class="text-decoration-none px-3 py-2 d-block fw-lighter">
                  <i class="fa-regular fa-question me-3"></i>About Us
                </a>
              </li>
            </ul>
          </div>

          <hr class="h-color mx-2" />
          <div>
            <ul class="list-unstyled px-2">
              <li class="text-white fw-bold d-block px-3 py-4 d-block" style="font-size: 12px">
                ACCOUNT PAGES
              </li>
              <li class="">
                <a href="/LiveHelp/profile" class="text-decoration-none px-3 py-2 d-block fw-lighter">
                  <i class="fa-solid fa-address-card me-3"></i>Profile
                </a>
              </li>
            </ul>
          </div>
        </div>
        <div class="footer d-flex flex-column gap-4 justify-content-center align-items-center text-center">
          <div>
            <button class="btn-custom1 fw-light btn-tac" style="width: 192px">Terms and Conditions</button>
          </div>
          <div>
            <button class="btn-custom2 fw-light btn-signout" style="width: 192px">Sign Out</button>
          </div>
        </div>
      </div>
      <div class="content bg-light">
        <nav class="navbar navbar-expand-md navbar-light bg-light">
          <div class="container-fluid d-flex justify-content-between">
            <div class="d-flex justify-content-end w-100">
              <div class="d-flex justify-content-start d-md-none d-block">
                <button class="btn px-1 py-0 open-btn me-2">
                  <i class="fa-solid fa-bars"></i>
                </button>
              </div>
              <ul class="navbar-nav mb-2 mx-3 mb-lg-0 d-flex flex-row justify-content-start align-items-center text-center gap-3 ms-4">
                <li class="nav-item hide">
                  <div class="d-flex flex-row">
                    <p class="text-secondary fw-lighter">Pages /</p>
                    <p class="text-dark fw-light">&nbsp;Solved Tickets</p>
                  </div>
                </li>
              </ul>
              <ul class="navbar-nav mb-2 mx-3 mb-lg-0 d-flex flex-row justify-content-end align-items-center text-center gap-3 ms-auto">
                <li class="nav-item">
                  <button class="btn-create fw-bold px-3 py-1 me-3">CREATE</button>
                </li>
                <li class="nav-item dropdown custom-position">
                  <button class="btn btn-bell btn-light dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                    <i class="fa-regular fa-bell"></i><span id="unreadCount" class="badge bg-danger ms-1"></span>
                  </button>
                  <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="dropdownMenuButton" style="width: 300px">
                    <div id="notificationList"></div>
                    <li><hr class="dropdown-divider"></li>
                    <li><button id="markAllAsRead" class="dropdown-item text-center">Mark all as read</button></li>
                  </ul>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" aria-current="page" href="#">
                    <i class="fa-regular fa-address-card me-2"></i>Profile
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <div class="dashboard-content px-3 pt-4">
          <div class="container-fluid py-4">
            <div class="row gx-3 gy-2" id="totalTicketsList">
              <!-- Aici sunt inserate tichetele -->
            </div>
          </div>
        </div>
         <footer
          class="footer-content d-flex justify-content-between align-items-center"
        >
          <div class="d-flex align-items-center">
            <span class="text-muted"
              >&copy; 2024 HelpDesk. All rights reserved.</span
            >
          </div>
          <div class="d-flex align-items-center">
            <p class="mb-2 me-3">
              <a href="#" class="text-secondary text-decoration-none"
                >About us</a
              >
            </p>
            <p class="mb-2">
              <a href="#" class="text-secondary text-decoration-none"
                >Terms and Conditions</a
              >
            </p>
          </div>
        </footer>
      </div>
    </div>

  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>

  <script>
  $(document).ready(function () {
	    var currentUserId = localStorage.getItem("id_utilizator");

	    if (!currentUserId) {
	        alert("Utilizatorul nu este autentificat.");
	        return;
	    }

	    $.ajax({
	        url: "/LiveHelp/rest/istoric/getall",
	        method: "GET",
	        success: function (istoricResponse) {
	            console.log("Istoric Response:", istoricResponse);

	            var ticketIds = istoricResponse.map(ticket => ticket.id_tichet);
	            if (ticketIds.length === 0) {
	                $("#totalTicketsList").html("<p>No tickets found.</p>");
	                return;
	            }

	            $.when(
	                $.ajax({ url: "/LiveHelp/rest/tichet/getall", method: "GET" }),
	                $.ajax({ url: "/LiveHelp/rest/utilizator/getall", method: "GET" }),
	                $.ajax({ url: "/LiveHelp/rest/categorie/getall", method: "GET" })
	            ).done(function (tichetResponse, utilizatorResponse, categorieResponse) {

	                var tichetMap = {};
	                tichetResponse[0].forEach(tichet => {
	                    tichetMap[tichet.id] = {
	                        id_categorie: tichet.id_categorie
	                    };
	                });

	                var utilizatorMap = {};
	                utilizatorResponse[0].forEach(utilizator => {
	                    utilizatorMap[utilizator.id] = utilizator;
	                });

	                var categorieMap = {};
	                categorieResponse[0].forEach(categorie => {
	                    categorieMap[categorie.id] = categorie.nume;
	                });

	                istoricResponse.forEach(ticket => {
	                    var stadiu = ticket.stadiu || "Unknown"; // Preia stadiul din istoric

	                    if (stadiu === "sent" || stadiu === "working") {
	                        var tichet = tichetMap[ticket.id_tichet] || {};
	                        var utilizator = utilizatorMap[ticket.id_utilizator] || {};
	                        var categorie = categorieMap[tichet.id_categorie] || "Unknown";

	                        var iconClass, iconBgClass;

	                        switch (stadiu) {
	                          case "sent":
	                              iconClass = "fa-paper-plane";
	                              iconBgClass = "bg-icon-sent";
	                              break;
	                          case "working":
	                              iconClass = "fa-gears";
	                              iconBgClass = "bg-icon-working";
	                              break;
	                        }

	                        var cardDiv = document.createElement("div");
	                        cardDiv.className = `col-xl-4 col-lg-6 col-md-12 col-sm-12 mb-5`;

	                        var innerCardDiv = document.createElement("div");
	                        innerCardDiv.className = "card position-relative";

	                        var cardHeaderDiv = document.createElement("div");
	                        cardHeaderDiv.className = "card-header rounded-5 d-flex justify-content-between align-items-center bg-white position-relative p-4";

	                        var textStartDiv = document.createElement("div");
	                        textStartDiv.className = "text-start";

	                        var categoryP = document.createElement("p");
	                        categoryP.className = "fw-bold mb-1";
	                        categoryP.textContent = "Category: " + categorie;

	                        var creatorP = document.createElement("p");
	                        creatorP.className = "mb-0 text-muted fw-light";
	                        creatorP.textContent = "Created by: " + (utilizator.nume + " " + utilizator.prenume);

	                        var iconDiv = document.createElement("div");
	                        iconDiv.className = "icon " + iconBgClass;

	                        var icon = document.createElement("i");
	                        icon.className = "fa " + iconClass;
	                        iconDiv.appendChild(icon);

	                        var cardBodyDiv = document.createElement("div");
	                        cardBodyDiv.className = "card-body p-4";

	                        var textP = document.createElement("p");
	                        textP.className = "mb-0";
	                        textP.textContent = ticket.text ? (ticket.text.length > 30 ? ticket.text.substring(0, 30) + "..." : ticket.text) : "No text available";
	                        cardBodyDiv.appendChild(textP);

	                        textStartDiv.appendChild(categoryP);
	                        textStartDiv.appendChild(creatorP);

	                        cardHeaderDiv.appendChild(textStartDiv);
	                        cardHeaderDiv.appendChild(iconDiv);

	                        innerCardDiv.appendChild(cardHeaderDiv);
	                        innerCardDiv.appendChild(cardBodyDiv);

	                        cardDiv.appendChild(innerCardDiv);

	                        $("#totalTicketsList").append(cardDiv);
	                    }
	                });
	            }).fail(function () {
	                alert("Eroare la obținerea informațiilor suplimentare.");
	            });
	        },
	        error: function () {
	            alert("Eroare la obținerea tichetelor.");
	        }
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
		  $(".btn-signout").click(function() {
			    localStorage.clear();
			    window.location.href = "/LiveHelp/login";
			  });

			  $(".btn-tac").click(function(){
			    window.location.href = "/LiveHelp/terms-and-conditions";
			  });
			  $(".btn-create").click(function(){
				    window.location.href = "/LiveHelp/create";
				  });

	    // Fetch notifications
	    $.get("/LiveHelp/rest/notificare/getbyparamfromuri?id_utilizator=" + currentUserId, function (notifications) {
	      var unreadCount = 0;
	      var notificationList = document.getElementById("notificationList");

	      notificationList.innerHTML = "";

	      if (!notifications || notifications.length === 0) {
	        var noNotificationsItem = document.createElement("li");
	        var noNotificationsLink = document.createElement("a");
	        noNotificationsLink.className = "dropdown-item";
	        noNotificationsLink.href = "#";
	        noNotificationsLink.textContent = "No new notifications";
	        noNotificationsItem.appendChild(noNotificationsLink);
	        notificationList.appendChild(noNotificationsItem);
	      } else {
	        var displayedNotifications = notifications.slice(-5);

	        displayedNotifications.forEach(function (notification) {
	          var listItem = document.createElement("li");
	          var link = document.createElement("a");
	          link.className = "dropdown-item";
	          link.href = "#";
	          link.textContent = notification.text;

	          listItem.appendChild(link);
	          notificationList.insertBefore(listItem, notificationList.firstChild);

	          if (notification.stadiu === "unread") {
	            unreadCount++;
	          }

	          listItem.addEventListener("click", function () {
	            $.ajax({
	              url: "/LiveHelp/rest/notificare/updatebyid?id=" + notification.id,
	              method: "PUT",
	              contentType: "application/json",
	              data: JSON.stringify({ stadiu: "read" }),
	              success: function () {
	                console.log("Notification ID " + notification.id + " marked as read.");
	                localStorage.setItem("id_tichet", notification.id_tichet);
	                window.location.href = "/LiveHelp/respond-ticket";
	              },
	              error: function () {
	                console.error("Eroare la marcarea notificării ID " + notification.id + " ca citită.");
	              }
	            });
	          });
	        });

	        if (unreadCount > 0) {
	          document.getElementById("unreadCount").textContent = unreadCount;
	          document.getElementById("unreadCount").style.display = ""; // Display the counter
	        } else {
	          document.getElementById("unreadCount").style.display = "none"; // Hide the counter if no notifications
	        }
	      }

	      // Mark all notifications as read
	      $("#markAllAsRead").on("click", function () {
	        var unreadNotifications = notifications.filter(function (notification) {
	          return notification.stadiu === "unread";
	        });

	        unreadNotifications.forEach(function (notification) {
	          $.ajax({
	            url: "/LiveHelp/rest/notificare/updatebyid?id=" + notification.id,
	            method: "PUT",
	            contentType: "application/json",
	            data: JSON.stringify({ stadiu: "read" }),
	            success: function () {
	              console.log("Notification ID " + notification.id + " marked as read.");
	            },
	            error: function () {
	              console.error("Eroare la marcarea notificării ID " + notification.id + " ca citită.");
	            }
	          });
	        });

	        location.reload();
	      });
	    }).fail(function () {
	      alert("Eroare la obținerea notificărilor.");
	    });
	});

  </script>
</body>
</html>
