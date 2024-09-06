<!DOCTYPE html>
<html lang="en">
<head>
  <title>Homepage</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
  <link rel="stylesheet" href="static/css/styling/homepage.css" />
  <link rel="stylesheet" href="static/css/styling/sidebar.css" />
  <link rel="stylesheet" href="static/css/styling/navbar.css" />
</head>
<body>
  <div class="main-container d-flex padding-media">
    <div class="sidebar sidebar-custom-color my-3 p-1 rounded-4" id="side_nav">
      <div class="header-box px-2 pt-4 pb-4 d-flex justify-content-center align-items-center text-center">
        <h1 class="fs-5 text"><span class="text-white">HelpDesk Dashboard</span></h1>
        <button class="btn d-md-none d-block close-btn px-1 py-0 text-white">
          <i class="fas fa-times"></i>
        </button>
      </div>
      <div class="d-flex flex-column" style="height: 74%">
        <div>
          <ul class="list-unstyled px-2 pt-4 text-start">
            <li class="active"><a href="/LiveHelp/homepage" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-chart-line me-3"></i>Dashboard</a></li>
            <li class=""><a href="/LiveHelp/your-tickets" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-regular fa-user me-3"></i>Your Tickets</a></li>
            <li class=""><a href="/LiveHelp/tickets-to-solve" class="text-decoration-none px-3 py-2 d-block d-flex justify-content-between fw-lighter"><span><i class="fa-solid fa-ticket me-3"></i>Tickets to Solve</span></a></li>
            <li class=""><a href="/LiveHelp/history" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-clock-rotate-left me-3"></i>History</a></li>
            <li class=""><a href="/LiveHelp/users" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-users me-3"></i>Users</a></li>
            <li class=""><a href="/LiveHelp/about-us" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-regular fa-question me-3"></i>About Us</a></li>
          </ul>
        </div>

        <hr class="h-color mx-2" />
        <div>
          <ul class="list-unstyled px-2">
            <li class="text-white fw-bold d-block px-3 py-4 d-block" style="font-size: 12px">ACCOUNT PAGES</li>
            <li class=""><a href="/LiveHelp/profile" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-address-card me-3"></i>Profile</a></li>
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
                  <p class="text-dark fw-light">&nbsp;Dashboard</p>
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
          <div class="row">
            <div class="col-xl-6 col-sm-12 mb-xl-5 mb-5">
              <div class="card position-relative">
                <div class="card-header rounded-5 d-flex justify-content-between align-items-center bg-white position-relative">
                  <div class="icon bg-your-ticket">
                    <i class="fa-regular fa-user fa-lg"></i>
                  </div>
                  <div class="ms-auto text-end">
                    <p class="text-muted mb-1">Your Total Tickets</p>
                    <h4 class="mb-0 fw-bold yourTotalTickets"></h4>
                  </div>
                </div>
                <div class="card-body">
                  <p class="mb-0">
                    <button class="btn-your-ticket fw-light">Check</button>
                  </p>
                </div>
              </div>
            </div>
            <div class="col-xl-6 col-sm-12 mb-xl-5 mb-5">
              <div class="card position-relative">
                <div class="card-header rounded-5 d-flex justify-content-between align-items-center bg-white position-relative">
                  <div class="icon bg-total-tickets">
                    <i class="fa-solid fa-ticket"></i>
                  </div>
                  <div class="ms-auto text-end">
                    <p class="text-muted mb-1">Total Tickets</p>
                    <h4 class="mb-0 fw-bold totalTickets"></h4>
                  </div>
                </div>
                <div class="card-body">
                  <p class="mb-0">
                    <button class="btn-total-tickets fw-light">Check</button>
                  </p>
                </div>
              </div>
            </div>
            <div class="col-xl-6 col-sm-12 mb-xl-5 mb-5">
              <div class="card position-relative">
                <div class="card-header rounded-5 d-flex justify-content-between align-items-center bg-white position-relative">
                  <div class="icon bg-solved-tickets">
                    <i class="fa-solid fa-square-check"></i>
                  </div>
                  <div class="ms-auto text-end">
                    <p class="text-muted mb-1">Solved Tickets</p>
                    <h4 class="mb-0 fw-bold solvedTickets"></h4>
                  </div>
                </div>
                <div class="card-body">
                  <p class="mb-0">
                    <button class="btn-solved fw-light">Check</button>
                  </p>
                </div>
              </div>
            </div>
            <div class="col-xl-6 col-sm-12 mb-xl-5 mb-5">
              <div class="card position-relative">
                <div class="card-header rounded-5 d-flex justify-content-between align-items-center bg-white position-relative">
                  <div class="icon bg-unsolved-tickets">
                    <i class="fa-regular fa-square-check"></i>
                  </div>
                  <div class="ms-auto text-end">
                    <p class="text-muted mb-1">Unsolved Tickets</p>
                    <h4 class="mb-0 fw-bold unsolvedTickets"></h4>
                  </div>
                </div>
                <div class="card-body">
                  <button class="btn-unsolved fw-light">Check</button>
                </div>
              </div>
            </div>
          </div>
        </div>

        <footer class="footer-content d-flex flex-row justify-content-around">
          <div class="d-flex align-items-center">
            <span class="text-muted">&copy; 2024 HelpDesk. All rights reserved.</span>
          </div>
          <div class="d-flex align-items-center">
            <p class="mb-2 me-3">
              <a href="/LiveHelp/about-us" class="text-secondary text-decoration-none">About us</a>
            </p>
            <p class="mb-2">
              <a href="/LiveHelp/terms-and-conditions" class="text-secondary text-decoration-none">Terms and Conditions</a>
            </p>
          </div>
        </footer>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  <script>
  $(document).ready(function() {
    var userId = localStorage.getItem("id_utilizator");

    if (!userId) {
      alert("No user ID found. Please log in again.");
      return;
    }

    // Fetch the user role
    $.ajax({
      url: `/LiveHelp/rest/rol/getbyid?id=` + userId,
      method: 'GET',
      success: function(roleResponse) {
        var userRole = roleResponse.nume;

        // Show or hide buttons based on user role
        if (userRole !== 'Admin') {
          $(".btn-your-ticket, .btn-total-tickets, .btn-solved, .btn-unsolved").hide();
        }

        // Fetch tickets for the user
        $.ajax({
          url: `/LiveHelp/rest/istoric/getbyparamfromuri`,
          method: 'GET',
          data: { id_utilizator: userId },
          success: function(response) {
            var uniqueTicketIds = new Set();
            response.forEach(function(ticket) {
              uniqueTicketIds.add(ticket.id_tichet);
            });
            $(".yourTotalTickets").text(uniqueTicketIds.size);
          },
          error: function() {
            alert("An error occurred while retrieving your tickets.");
          }
        });

        // Fetch all tickets
        $.ajax({
          url: `/LiveHelp/rest/istoric/getall`,
          method: 'GET',
          success: function(response) {
            var uniqueTicketIds = new Set();
            response.forEach(function(ticket) {
              uniqueTicketIds.add(ticket.id_tichet);
            });
            $(".totalTickets").text(uniqueTicketIds.size);
          },
          error: function() {
            alert("An error occurred while retrieving total tickets.");
          }
        });

        // Count solved and unsolved tickets
        $.ajax({
          url: `/LiveHelp/rest/istoric/getall`,
          method: 'GET',
          success: function(response) {
            var solvedCount = 0;
            var unsolvedCount = 0;
            var countedTickets = new Set();

            response.forEach(function(ticket) {
              if (!countedTickets.has(ticket.id_tichet)) {
                countedTickets.add(ticket.id_tichet);
                if (ticket.stadiu === 'solved' || ticket.stadiu === 'self-closed') {
                  solvedCount++;
                } else {
                  unsolvedCount++;
                }
              }
            });

            $(".solvedTickets").text(solvedCount);
            $(".unsolvedTickets").text(unsolvedCount);
          },
          error: function() {
            alert("An error occurred while retrieving ticket statuses.");
          }
        });
      },
      error: function() {
        alert("An error occurred while retrieving user role.");
      }
    });

    // Button click handlers
    $(".btn-create").click(function() {
      window.location.href = "/LiveHelp/create-ticket";
    });
    $(".btn-your-ticket").click(function() {
      window.location.href = "/LiveHelp/your-tickets";
    });
    $(".btn-total-tickets").click(function() {
      window.location.href = "/LiveHelp/total-tickets";
    });
    $(".btn-solved").click(function() {
      window.location.href = "/LiveHelp/solved-tickets";
    });
    $(".btn-unsolved").click(function() {
      window.location.href = "/LiveHelp/unsolved-tickets";
    });

    $(".btn-signout").click(function() {
      localStorage.clear();
      window.location.href = "/LiveHelp/login";
    });

    $(".btn-tac").click(function(){
      window.location.href = "/LiveHelp/terms-and-conditions";
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

    // Notification functionality
    $.get("/LiveHelp/rest/notificare/getbyparamfromuri?id_utilizator=" + userId, function (notifications) {
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
                console.error("Eroare la marcarea notificarii ID " + notification.id + " ca citita.");
              }
            });
          });
        });

        if (unreadCount > 0) {
          document.getElementById("unreadCount").textContent = unreadCount;
          document.getElementById("unreadCount").style.display = ""; 
        } else {
          document.getElementById("unreadCount").style.display = "none"; 
        }
      }

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
              console.error("Eroare la marcarea notificarii ID " + notification.id + " ca citita.");
            }
          });
        });

        location.reload();
      });
    }).fail(function () {
      alert("Eroare la obtinerea notificarilor.");
    });
  });

  </script>
</body>
</html>
