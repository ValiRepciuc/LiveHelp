<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Users</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
<link rel="stylesheet" href="static/css/styling/users.css" />
<link rel="stylesheet" href="static/css/styling/sidebar.css" />
<link rel="stylesheet" href="static/css/styling/navbar.css" />
<link rel="stylesheet" href="static/css/styling/footer.css" />
</head>
<body>
   <div class="main-container d-flex padding-media">
      <div class="sidebar sidebar-custom-color my-3 p-1 rounded-4" id="side_nav">
        <div class="header-box px-2 pt-4 pb-4 d-flex justify-content-center align-items-center text-center">
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
                <a href="/LiveHelp/homepage" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-chart-line me-3"></i>Dashboard</a>
              </li>
              <li class="">
                <a href="/LiveHelp/your-tickets" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-regular fa-user me-3"></i>Your Tickets</a>
              </li>
              <li class="">
                <a href="/LiveHelp/tickets-to-solve" class="text-decoration-none px-3 py-2 d-block d-flex justify-content-between fw-lighter">
                  <span><i class="fa-solid fa-ticket me-3"></i>Tickets to Solve</span>
                </a>
              </li>
              <li class="">
                <a href="/LiveHelp/history" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-clock-rotate-left me-3"></i>History</a>
              </li>
              <li class="active">
                <a href="/LiveHelp/users" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-users me-3"></i>Users</a>
              </li>
              <li class="">
                <a href="/LiveHelp/about-us" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-regular fa-question me-3"></i>About Us</a>
              </li>
            </ul>
          </div>
          <hr class="h-color mx-2" />
          <div>
            <ul class="list-unstyled px-2">
              <li class="text-white fw-bold d-block px-3 py-4 d-block" style="font-size: 12px">ACCOUNT PAGES</li>
              <li class="">
                <a href="/LiveHelp/profile" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-address-card me-3"></i>Profile</a>
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
                    <p class="text-dark fw-light">&nbsp;Users</p>
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
                  <a class="nav-link active" aria-current="page" href="/LiveHelp/profile">
                    <i class="fa-regular fa-address-card me-2"></i>Profile
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <div class="dashboard-content px-3 pt-4">
          <div class="container-fluid py-4">
            <div class="row gx-3 gy-2" id="userList">
              <!-- Aici sunt inserate utilizatorii -->
            </div>
          </div>
        </div>
         <footer class="footer-content d-flex justify-content-between align-items-center">
          <div class="d-flex align-items-center">
            <span class="text-muted">&copy; 2024 HelpDesk. All rights reserved.</span>
          </div>
          <div class="d-flex align-items-center">
            <p class="mb-2 me-3">
              <a href="#" class="text-secondary text-decoration-none">About us</a>
            </p>
            <p class="mb-2">
              <a href="#" class="text-secondary text-decoration-none">Terms and Conditions</a>
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
	        url: "/LiveHelp/rest/rol/getbyid?id=" + currentUserId,
	        method: "GET",
	        success: function (currentUserRole) {
	            console.log("Current user role:", currentUserRole);
	            var isAdmin = currentUserRole && currentUserRole.nume === "Admin";

	            $.ajax({
	                url: "/LiveHelp/rest/utilizator/getall",
	                method: "GET",
	                success: function (utilizatori) {
	                    console.log("Utilizatori:", utilizatori);
	                    $.ajax({
	                        url: "/LiveHelp/rest/rol/getall",
	                        method: "GET",
	                        success: function (roluri) {
	                            console.log("Roluri:", roluri);
	                            var roluriMap = {};
	                            roluri.forEach(function (rol) {
	                                roluriMap[rol.id_utilizator] = { id: rol.id, nume: rol.nume };
	                            });

	                            utilizatori.forEach(function (utilizator) {
	                                var rolInfo = roluriMap[utilizator.id] || { id: null, nume: 'N/A' };
	                                var userName = (utilizator.nume !== null && utilizator.prenume !== null) 
	                                    ? utilizator.nume + " " + utilizator.prenume 
	                                    : "Nume Prenume";

	                                console.log("User:", userName, "Role:", rolInfo.nume);

	                                var cardDiv = document.createElement("div");
	                                cardDiv.className = "col-xl-4 col-lg-6 col-md-12 col-sm-12 mb-5";

	                                var innerCardDiv = document.createElement("div");
	                                innerCardDiv.className = "card position-relative";

	                                var cardHeaderDiv = document.createElement("div");
	                                cardHeaderDiv.className = "card-header rounded-5 d-flex justify-content-between align-items-center bg-white position-relative p-4";

	                                var textStartDiv = document.createElement("div");
	                                textStartDiv.className = "text-start";

	                                var nameP = document.createElement("p");
	                                nameP.className = "fw-bold mb-1";
	                                nameP.textContent = userName;

	                                var roleP = document.createElement("p");
	                                roleP.className = "mb-0 text-muted fw-light";
	                                roleP.textContent = rolInfo.nume;

	                                var iconDiv = document.createElement("div");
	                                iconDiv.className = "icon bg-icon";
	                                var icon = document.createElement("i");
	                                icon.className = "fa-solid fa-user-tie";
	                                iconDiv.appendChild(icon);

	                                var cardBodyDiv = document.createElement("div");
	                                cardBodyDiv.className = "card-body d-flex justify-content-between align-items-center p-4";

	                                if (isAdmin) {
	                                    var applyButton = document.createElement("button");
	                                    applyButton.className = "btn-apply fw-light";
	                                    applyButton.textContent = "Apply Role";
	                                    applyButton.setAttribute("data-id", rolInfo.id); // ID-ul din tabelul rol
	                                    applyButton.setAttribute("data-uid", utilizator.id); // ID-ul utilizatorului
	                                    applyButton.setAttribute("data-role", rolInfo.nume);

	                                    var dropdownDiv = document.createElement("div");
	                                    dropdownDiv.className = "nav-item dropdown custom-position";

	                                    var dropdownButton = document.createElement("button");
	                                    dropdownButton.className = "btn btn-bell btn-light dropdown-toggle";
	                                    dropdownButton.setAttribute("type", "button");
	                                    dropdownButton.setAttribute("id", "dropdownMenuButton" + utilizator.id);
	                                    dropdownButton.setAttribute("data-bs-toggle", "dropdown");
	                                    dropdownButton.setAttribute("aria-expanded", "false");
	                                    dropdownButton.innerHTML = "<p class='fw-light m-0'>Assign Role</p>";

	                                    var dropdownMenu = document.createElement("ul");
	                                    dropdownMenu.className = "dropdown-menu dropdown-menu-end";
	                                    dropdownMenu.setAttribute("aria-labelledby", "dropdownMenuButton" + utilizator.id);
	                                    dropdownMenu.style.width = "300px";

	                                    var roles = ["Admin", "IT", "Logistica", "HR"];
	                                    roles.forEach(function (role) {
	                                        var li = document.createElement("li");
	                                        var a = document.createElement("a");
	                                        a.className = "dropdown-item";
	                                        a.href = "#";
	                                        a.textContent = role;
	                                        a.addEventListener("click", function () {
	                                            applyButton.setAttribute("data-role", role);
	                                            dropdownButton.innerHTML = "<p class='fw-light m-0'>Role: " + role + "</p>";
	                                        });
	                                        li.appendChild(a);
	                                        dropdownMenu.appendChild(li);
	                                    });

	                                    dropdownDiv.appendChild(dropdownButton);
	                                    dropdownDiv.appendChild(dropdownMenu);

	                                    cardBodyDiv.appendChild(applyButton);
	                                    cardBodyDiv.appendChild(dropdownDiv);
	                                } else {
	                                    var noAccessMessage = document.createElement("p");
	                                    noAccessMessage.className = "text-danger";
	                                    noAccessMessage.textContent = "You do not have access to modify roles.";
	                                    cardBodyDiv.appendChild(noAccessMessage);
	                                }

	                                textStartDiv.appendChild(nameP);
	                                textStartDiv.appendChild(roleP);

	                                cardHeaderDiv.appendChild(textStartDiv);
	                                cardHeaderDiv.appendChild(iconDiv);

	                                innerCardDiv.appendChild(cardHeaderDiv);
	                                innerCardDiv.appendChild(cardBodyDiv);

	                                cardDiv.appendChild(innerCardDiv);

	                                $("#userList").append(cardDiv);
	                            });

	                            $(document).on("click", ".btn-apply", function () {
	                                var roleId = $(this).data("id");
	                                var userId = $(this).data("uid");
	                                var newRole = $(this).data("role");

	                                console.log("Attempting to apply role:", newRole, "to user ID:", userId);

	                                if (newRole === 'N/A') {
	                                    alert("Please select a role before applying.");
	                                    return;
	                                }

	                                if (confirm("Are you sure you want to assign the role '" + newRole + "' to this user?")) {
	                                    updateRole(roleId, userId, newRole);
	                                }
	                            });

	                            function updateRole(roleId, userId, newRole) {
	                                console.log("Updating role for user ID:", userId, "to:", newRole);
	                                if (roleId) {
	                                    $.ajax({
	                                        url: "/LiveHelp/rest/rol/updatebyid?id=" + roleId,
	                                        method: "PUT",
	                                        contentType: "application/json",
	                                        data: JSON.stringify({
	                                            id_utilizator: userId,
	                                            nume: newRole
	                                        }),
	                                        success: function () {
	                                            console.log("Role updated successfully.");
	                                            location.reload(); // Refresh page
	                                        },
	                                        error: function () {
	                                            alert("Error updating the role.");
	                                        }
	                                    });
	                                } else {
	                                    $.ajax({
	                                        url: "/LiveHelp/rest/rol/insert",
	                                        method: "POST",
	                                        contentType: "application/json",
	                                        data: JSON.stringify({
	                                            id_utilizator: userId,
	                                            nume: newRole
	                                        }),
	                                        success: function () {
	                                            console.log("Role inserted successfully.");
	                                            location.reload(); // Refresh page
	                                        },
	                                        error: function () {
	                                            alert("Error inserting the role.");
	                                        }
	                                    });
	                                }
	                            }
	                        },
	                        error: function () {
	                            alert("Error fetching roles.");
	                        }
	                    });
	                },
	                error: function () {
	                    alert("Error fetching users.");
	                }
	            });
	        },
	        error: function () {
	            alert("Error fetching current user's role.");
	        }
	    });

	    // Sidebar and other UI interactions
	    $(".sidebar ul li").on("click", function () {
	        $(".sidebar ul li.active").removeClass("active");
	        $(this).addClass("active");
	    });

	    $(".open-btn").on("click", function () {
	        $("#side_nav").addClass("active");
	    });

	    $(".close-btn").on("click", function () {
	        $("#side_nav").removeClass("active");
	    });

	    $(".btn-signout").click(function () {
	        localStorage.clear();
	        window.location.href = "/LiveHelp/login";
	    });

	    $(".btn-tac").click(function () {
	        window.location.href = "/LiveHelp/terms-and-conditions";
	    });

	    $(".btn-create").click(function () {
	        window.location.href = "/LiveHelp/create-ticket";
	    });

	    // Fetch notifications
	    $.get("/LiveHelp/rest/notificare/getbyparamfromuri?id_utilizator=" + currentUserId, function (notifications) {
	        console.log("Notifications received:", notifications);
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
	                            console.error("Error marking notification ID " + notification.id + " as read.");
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
	                        console.error("Error marking notification ID " + notification.id + " as read.");
	                    }
	                });
	            });

	            location.reload(); // Refresh page
	        });
	    }).fail(function () {
	        alert("Error fetching notifications.");
	    });
	});



  </script>
</body>
</html>
