<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>History</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
<link rel="stylesheet" href="static/css/styling/your-tickets.css" />
<link rel="stylesheet" href="static/css/styling/sidebar.css" />
<link rel="stylesheet" href="static/css/styling/navbar.css" />
<style>
    .star-rating {
    display: flex;
    align-items: center;
    margin-top: 10px;
  }
  .star-rating .fa-star {
    font-size: 24px;
    color: #ddd;
    cursor: pointer;
    margin: 0 2px;
  }
  .star-rating .fa-star.selected {
    color: #f5a623;
  }
  .rating-confirm {
    display: none;
    margin-left: 15px;
  }
  .rating-confirm.visible {
    display: inline-block;
  }
  .rating-alert {
    display: none;
    margin-top: 10px;
    color: #28a745;
    font-weight: bold;
  }
</style>
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
          <li class=""><a href="/LiveHelp/homepage" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-chart-line me-3"></i>Dashboard</a></li>
          <li class=""><a href="/LiveHelp/your-tickets" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-regular fa-user me-3"></i>Your Tickets</a></li>
          <li class=""><a href="/LiveHelp/tickets-to-solve" class="text-decoration-none px-3 py-2 d-block d-flex justify-content-between fw-lighter"><span><i class="fa-solid fa-ticket me-3"></i>Tickets to Solve</span></a></li>
          <li class="active"><a href="/LiveHelp/history" class="text-decoration-none px-3 py-2 d-block fw-lighter"><i class="fa-solid fa-clock-rotate-left me-3"></i>History</a></li>
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
            <button class="btn px-1 py-0 open-btn me-2"><i class="fa-solid fa-bars"></i></button>
          </div>
          <ul class="navbar-nav mb-2 mx-3 mb-lg-0 d-flex flex-row justify-content-start align-items-center text-center gap-3 ms-4">
            <li class="nav-item hide">
              <div class="d-flex flex-row">
                <p class="text-secondary fw-lighter">Pages /</p>
                <p class="text-dark fw-light">&nbsp;Your Tickets</p>
              </div>
            </li>
          </ul>
          <ul class="navbar-nav mb-2 mx-3 mb-lg-0 d-flex flex-row justify-content-end align-items-center text-center gap-3 ms-auto">
            <li class="nav-item"><button class="btn-create fw-bold px-3 py-1 me-3">CREATE</button></li>
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
            <li class="nav-item"><a class="nav-link active" aria-current="page" href="/LiveHelp/profile"><i class="fa-regular fa-address-card me-2"></i>Profile</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="dashboard-content px-3 pt-4">
      <div class="container-fluid py-2">
        <div class="row">
          <!-- Tichetele vor fi afișate aici -->
        </div>
      </div>
    </div>
    <footer class="footer-content d-flex justify-content-between align-items-center">
      <div class="d-flex align-items-center">
        <span class="text-muted">&copy; 2024 HelpDesk. All rights reserved.</span>
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
      alert("Utilizatorul nu este logat.");
      window.location.href = "/LiveHelp/login";
    }

    $.ajax({
      url: "/LiveHelp/rest/istoric/getall",
      method: "GET",
      success: function (istoricResponse) {
        console.log("Received data:", istoricResponse);
        var userTickets = istoricResponse.filter(function (item) {
          return item.id_utilizator == userId && item.stadiu !== "response";
        });

        if (userTickets.length === 0) {
          $(".row").append("<p class='text-center'>Nu sunt tichete disponibile.</p>");
          return;
        }

        userTickets.forEach(function (ticket) {
          $.ajax({
            url: "/LiveHelp/rest/tichet/getbyid",
            method: "GET",
            data: { id: ticket.id_tichet },
            success: function (tichetResponse) {
              var categoryId = tichetResponse.id_categorie;

              $.ajax({
                url: "/LiveHelp/rest/categorie/getbyid",
                method: "GET",
                data: { id: categoryId },
                success: function (categorieResponse) {
                  var categoryName = categorieResponse.nume;

                  var iconClass = "";
                  var iconBgClass = "";

                  switch (ticket.stadiu) {
                    case "sent":
                      iconClass = "fa-paper-plane";
                      iconBgClass = "bg-icon-sent";
                      break;
                    case "working":
                      iconClass = "fa-gears";
                      iconBgClass = "bg-icon-working";
                      break;
                    case "solved":
                      iconClass = "fa-check";
                      iconBgClass = "bg-icon-solved";
                      break;
                    default:
                      iconClass = "fa-regular fa-circle-xmark";
                      iconBgClass = "bg-danger";
                      break;
                  }

                  var colDiv = document.createElement("div");
                  colDiv.className = "col-xl-12 col-lg-12 col-md-12 col-sm-12 mb-xl-3 mb-3";

                  var cardDiv = document.createElement("div");
                  cardDiv.className = "card position-relative";

                  var cardHeaderDiv = document.createElement("div");
                  cardHeaderDiv.className = "card-header rounded-5 d-flex justify-content-between align-items-center bg-white position-relative";

                  var textStartDiv = document.createElement("div");
                  textStartDiv.className = "text-start";

                  var categoryP = document.createElement("p");
                  categoryP.className = "text-muted mb-1";
                  categoryP.textContent = categoryName;

                  var ticketP = document.createElement("p");
                  ticketP.className = "mb-0 mt-2 fw-light";
                  ticketP.textContent = ticket.text;

                  var iconDiv = document.createElement("div");
                  iconDiv.className = "icon " + iconBgClass;

                  var icon = document.createElement("i");
                  icon.className = "fa " + iconClass;

                  var cardBodyDiv = document.createElement("div");
                  cardBodyDiv.className = "card-body d-flex justify-content-between align-items-center position-relative";

                  var checkButton = document.createElement("button");
                  checkButton.className = "btn-ticket fw-light";
                  checkButton.textContent = "Check";

                  var deleteButton = document.createElement("button");
                  deleteButton.className = "lock-button";
                  var deleteIcon = document.createElement("i");
                  deleteIcon.className = "fa-solid fa-trash-can";
                  deleteButton.appendChild(deleteIcon);

                  iconDiv.appendChild(icon);
                  textStartDiv.appendChild(categoryP);
                  textStartDiv.appendChild(ticketP);

                  
                  if (ticket.stadiu === "solved") {
                    var ratingDiv = document.createElement("div");
                    ratingDiv.className = "star-rating";
                    ratingDiv.setAttribute("data-ticket-id", ticket.id_tichet);

                    for (var i = 0; i < 5; i++) {
                      var star = document.createElement("i");
                      star.className = "fa fa-star";
                      star.setAttribute("data-value", i + 1);
                      ratingDiv.appendChild(star);
                    }

                    var confirmButton = document.createElement("button");
                    confirmButton.className = "btn-custom1 rating-confirm";
                    confirmButton.textContent = "Confirm";
                    ratingDiv.appendChild(confirmButton);

                    var ratingAlert = document.createElement("div");
                    ratingAlert.className = "rating-alert";
                    ratingAlert.textContent = "Rating salvat!";

                    textStartDiv.appendChild(ratingDiv);
                    textStartDiv.appendChild(ratingAlert);

                    loadRating(ticket.id_tichet, ratingDiv);
                  }

                  cardHeaderDiv.appendChild(textStartDiv);
                  cardHeaderDiv.appendChild(iconDiv);

                  cardBodyDiv.appendChild(checkButton);
                  cardBodyDiv.appendChild(deleteButton);

                  cardDiv.appendChild(cardHeaderDiv);
                  cardDiv.appendChild(cardBodyDiv);

                  colDiv.appendChild(cardDiv);

                  $(".row").append(colDiv);

                  $(checkButton).on("click", function () {
                    localStorage.setItem("id_tichet", ticket.id_tichet);
                    window.location.href = "/LiveHelp/respond-ticket";
                  });

                  $(deleteButton).on("click", function () {
                    if (confirm("Sunteti sigur ca doriti sa stergeti acest tichet?")) {
                      deleteTicketById(ticket.id_tichet);
                    }
                  });
                },
                error: function () {
                  alert("Eroare la obținerea detaliilor categoriei.");
                },
              });
            },
            error: function () {
              alert("Eroare la obținerea detaliilor tichetului.");
            },
          });
        });
      },
      error: function () {
        alert("Eroare la obținerea tichetelor.");
      },
    });

    function isValidDate(date) {
      return typeof date === "number" && !isNaN(date);
    }

    function calculateTimeElapsed(postDate) {
      if (!isValidDate(postDate)) return "No date available";

      var postTime = postDate;
      var currentTime = Date.now();
      var timeDiff = currentTime - postTime;

      var minutes = Math.floor(timeDiff / (1000 * 60));

      if (minutes < 1) {
        return "Just now";
      } else if (minutes < 60) {
        return minutes + " minutes ago";
      } else {
        var hours = Math.floor(minutes / 60);
        return hours + " hours ago";
      }
    }

    function deleteTicketById(id_tichet) {
      $.ajax({
        url: "/LiveHelp/rest/istoric/getall",
        method: "GET",
        success: function (istoricResponse) {
          var ticketsToDelete = istoricResponse.filter(function (item) {
            return item.id_tichet === id_tichet;
          });

          ticketsToDelete.forEach(function (ticket) {
            $.ajax({
              url: "/LiveHelp/rest/istoric/deletebyid?id=" + ticket.id,
              method: "DELETE",
              success: function () {
                console.log("Deleted ticket with ID: " + ticket.id);
              },
              error: function () {
                alert("Eroare la ștergerea tichetului.");
              },
            });
          });

          location.reload();
        },
        error: function () {
          alert("Eroare la obținerea tichetelor pentru ștergere.");
        },
      });
    }

    function loadRating(ticketId, ratingDiv) {
      $.ajax({
        url: "/LiveHelp/rest/rating/getbyparamfromuri?id_tichet=" + ticketId,
        method: "GET",
        success: function (ratings) {
          if (ratings && ratings.length > 0) {
            var existingRating = ratings[0].valoare;
            highlightStars(ratingDiv, existingRating);
            $(ratingDiv).data("selected", existingRating); // Save the existing rating
          }
        },
        error: function () {
          alert("Eroare la obținerea ratingului.");
        },
      });

      $(ratingDiv).on("mouseover", ".fa-star", function () {
        var value = $(this).data("value");
        highlightStars(ratingDiv, value);
      });

      $(ratingDiv).on("mouseleave", function () {
        var selected = $(ratingDiv).data("selected") || 0;
        highlightStars(ratingDiv, selected);
      });

      $(ratingDiv).on("click", ".fa-star", function () {
        var value = $(this).data("value");
        highlightStars(ratingDiv, value);
        $(ratingDiv).data("selected", value);
        $(ratingDiv).find(".rating-confirm").addClass("visible");
      });

      $(ratingDiv).on("click", ".rating-confirm", function () {
        var value = $(ratingDiv).data("selected");
        saveRating(ticketId, value);
        $(ratingDiv).next(".rating-alert").show().delay(3000).fadeOut();
      });
    }

    function highlightStars(ratingDiv, value) {
      $(ratingDiv).find(".fa-star").each(function () {
        if ($(this).data("value") <= value) {
          $(this).addClass("selected");
        } else {
          $(this).removeClass("selected");
        }
      });
      $(ratingDiv).data("selected", value); // Save selected value
    }

    function saveRating(ticketId, value) {
      $.ajax({
        url: "/LiveHelp/rest/rating/getbyparamfromuri?id_tichet=" + ticketId,
        method: "GET",
        success: function (ratings) {
          if (ratings && ratings.length > 0) {
            // Update existing rating
            $.ajax({
              url: "/LiveHelp/rest/rating/updatebyid?id=" + ratings[0].id,
              method: "PUT",
              contentType: "application/json",
              data: JSON.stringify({ valoare: value }),
              success: function () {
                console.log("Rating updated.");
              },
              error: function () {
                alert("Eroare la actualizarea ratingului.");
              },
            });
          } else {
            // Insert new rating
            $.ajax({
              url: "/LiveHelp/rest/rating/insert",
              method: "POST",
              contentType: "application/json",
              data: JSON.stringify({ id_tichet: ticketId, valoare: value }),
              success: function () {
                console.log("Rating added.");
              },
              error: function () {
                alert("Eroare la adăugarea ratingului.");
              },
            });
          }
        },
        error: function () {
          alert("Eroare la verificarea ratingului.");
        },
      });
    }
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
