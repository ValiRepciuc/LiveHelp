<!DOCTYPE html>
<html lang="en">
<head>
  <title>Create Ticket</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
  <link rel="stylesheet" href="static/css/styling/create-ticket.css" />
  <link rel="stylesheet" href="static/css/styling/sidebar.css" />
  <link rel="stylesheet" href="static/css/styling/navbar.css" />
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
            <li class="">
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
            <p class="text-white fw-bold d-block px-3 py-4 d-block" style="font-size: 12px">ACCOUNT PAGES</p>
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
                  <p class="text-dark fw-light">&nbsp;Create Ticket</p>
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
                <a class="nav-link active" aria-current="page" href="/LiveHelp/profile"><i class="fa-regular fa-address-card me-2"></i>Profile</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <div class="dashboard-content px-3 pt-4">
        <div class="container-fluid">
          <div class="row d-flex flex-column">
            <div class="search_select_box">
              <select class="form-select" aria-label="Default select example">
                <option selected>Choose the domain</option>
                <option value="1">IT</option>
                <option value="2">Logistica</option>
                <option value="3">HR</option>
              </select>
            </div>
            <div class="col-lg-8 col-md-10 mg-auto w-100 d-flex flex-column justify-content-center mb-5">
              <div class="form-floating">
                <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 200px"></textarea>
                <label for="floatingTextarea2">Your Problem</label>
              </div>
            </div>
            <div class="d-flex justify-content-end pe-4">
              <button class="btn-apply">Post</button>
            </div>
          </div>
        </div>
      </div>
      <footer class="footer-content d-flex justify-content-between align-items-center">
        <div class="d-flex align-items-center">
          <span class="">&copy; 2024 HelpDesk. All rights reserved.</span>
        </div>
        <div class="d-flex align-items-center">
          <p class="mb-2 me-3"><a href="/LiveHelp/about-us" class="text-secondary text-decoration-none">About us</a></p>
          <p class="mb-2"><a href="/LiveHelp/terms-and-conditions" class="text-secondary text-decoration-none">Terms and Conditions</a></p>
        </div>
      </footer>
    </div>
  </div>

  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
   <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  <script>
  $(document).ready(function () {
	  var userId = localStorage.getItem("id_utilizator");
	  if (!userId) {
	    alert("Nu s-a gasit utilizator logat.");
	    window.location.href = "/LiveHelp/login";
	    }

	  // Gestionarea notificarilor
	  $.get("/LiveHelp/rest/notificare/getbyparamfromuri?id_utilizator=" + userId, function (notifications) {
	    var unreadCount = 0;
	    var notificationList = document.getElementById("notificationList");

	    // Curata lista de notificari existenta
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
	      // Afiseaza doar ultimele 5 notificari
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

	        // Eveniment de click pentru redirectionare si salvare in localStorage
	        listItem.addEventListener("click", function () {
	          // Schimba stadiul notificarii la "read"
	          $.ajax({
	            url: "/LiveHelp/rest/notificare/updatebyid?id=" + notification.id,
	            method: "PUT",
	            contentType: "application/json",
	            data: JSON.stringify({ stadiu: "read" }),
	            success: function () {
	              console.log("Notification ID " + notification.id + " marked as read.");
	              // Salveaza id_tichet in localStorage si redirectioneaza
	              localStorage.setItem("id_tichet", notification.id_tichet);
	              window.location.href = "/LiveHelp/respond-ticket";
	            },
	            error: function () {
	              console.error("Eroare la marcarea notificarii ID " + notification.id + " ca citita.");
	            }
	          });
	        });
	      });

	      // Afiseaza numarul de notificari necitite daca exista
	      if (unreadCount > 0) {
	        document.getElementById("unreadCount").textContent = unreadCount;
	        document.getElementById("unreadCount").style.display = ""; // Afiseaza contorul
	      } else {
	        document.getElementById("unreadCount").style.display = "none"; // Ascunde contorul daca nu sunt notificari
	      }
	    }

	    // Marcarea tuturor notificarilor ca citite
	    $("#markAllAsRead").on("click", function () {
	      notifications.forEach(function (notification) {
	        $.ajax({
	          url: "/LiveHelp/rest/notificare/updatebyid?id=" + notification.id,
	          method: "PUT",
	          contentType: "application/json",
	          data: JSON.stringify({ stadiu: "read" }),
	          success: function () {
	            console.log("Notification ID " + notification.id + " marked as read.");
	          },
	          error: function () {
	            console.error("Eroare la marcarea notificarii ID " + notification.id + " ca citita.");
	          }
	        });
	      });

	      location.reload();
	    });
	  }).fail(function () {
	    alert("Eroare la obtinerea notificarilor.");
	  });

	  // Obtine detaliile despre rolul utilizatorului
	  $.get("/LiveHelp/rest/rol/getbyid?id=" + userId, function (role) {
	    console.log("User role:", role); // Log pentru rolul utilizatorului

	    var userRoleName = role.nume;

	    // Obtine toate categoriile
	    $.get("/LiveHelp/rest/categorie/getall", function (categories) {
	      $(".search_select_box select option").each(function () {
	        var categoryName = $(this).text().trim();
	        if (userRoleName === categoryName) {
	          $(this).remove();
	        }
	      });

	      if ($(".search_select_box select option").length === 0) {
	        alert("Nu exista optiuni disponibile pentru categoria selectata.");
	      }
	    }).fail(function () {
	      alert("Eroare la obtinerea categoriilor.");
	    });

	    // Evenimentul pentru crearea unui tichet nou
	    $(".btn-apply").click(function () {
	      var selectedCategoryName = $(".search_select_box select option:selected").text();
	      $.get("/LiveHelp/rest/categorie/getall", function (categories) {
	        var selectedCategory = categories.find(category => category.nume === selectedCategoryName);
	        if (!selectedCategory) {
	          alert("Categorie invalida.");
	          return;
	        }

	        var categoryId = selectedCategory.id;
	        var problemText = $("#floatingTextarea2").val();
	        var ticketData = { id_categorie: categoryId };

	        // Crearea tichetului
	        $.ajax({
	          url: "/LiveHelp/rest/tichet/insert",
	          method: "POST",
	          contentType: "application/json",
	          data: JSON.stringify(ticketData),
	          success: function () {
	            $.get("/LiveHelp/rest/tichet/getall", function (tickets) {
	              var newTicket = tickets.reverse().find(ticket => ticket.id_categorie === categoryId);
	              if (!newTicket) {
	                alert("Tichetul nou creat nu a fost gasit.");
	                return;
	              }

	              var newTicketId = newTicket.id;
	              var istoricData = {
	                id_tichet: newTicketId,
	                id_utilizator: userId,
	                stadiu: "sent",
	                data: new Date().toISOString(),
	                text: problemText
	              };

	              // Crearea unei inregistrari in istoric
	              $.ajax({
	                url: "/LiveHelp/rest/istoric/insert",
	                method: "POST",
	                contentType: "application/json",
	                data: JSON.stringify(istoricData),
	                success: function () {
	                  // Obtine utilizatorii cu rolul specificat in categoria respectiva
	                  $.get("/LiveHelp/rest/rol/getall", function (roles) {
	                    console.log("Roles retrieved:", roles);

	                    var usersInCategory = roles
	                      .filter(r => r.nume === selectedCategoryName)
	                      .map(r => r.id_utilizator);

	                    console.log("Users in category:", usersInCategory);

	                    usersInCategory.forEach(function (userId) {
	                      var notificationData = {
	                        id_tichet: newTicketId,
	                        id_utilizator: userId,
	                        stadiu: "unread",
	                        text: "A new ticket has been created."
	                      };

	                      $.ajax({
	                        url: "/LiveHelp/rest/notificare/insert",
	                        method: "POST",
	                        contentType: "application/json",
	                        data: JSON.stringify(notificationData),
	                        success: function () {
	                          console.log("Notification sent to user ID: " + userId);
	                        },
	                        error: function () {
	                          alert("Eroare la trimiterea notificarii.");
	                        }
	                      });
	                    });

	                    window.location.href = "/LiveHelp/homepage"; // Redirectare la pagina principala
	                  });
	                },
	                error: function () {
	                  alert("Eroare la actualizarea istoricului.");
	                }
	              });
	            }).fail(function () {
	              alert("Eroare la obtinerea tichetelor.");
	            });
	          },
	          error: function () {
	            alert("Eroare la crearea tichetului.");
	          }
	        });
	      }).fail(function () {
	        alert("Eroare la obtinerea categoriilor.");
	      });
	    });
	  }).fail(function () {
	    alert("Eroare la obtinerea rolului utilizatorului.");
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
	  
	});

  </script>
</body>
</html>
