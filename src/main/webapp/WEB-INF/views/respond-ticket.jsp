<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Respond</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
  <link rel="stylesheet" href="static/css/styling/respond-to-ticket.css" />
  <link rel="stylesheet" href="static/css/styling/sidebar.css" />
  <link rel="stylesheet" href="static/css/styling/navbar.css" />
  <style>
    .star-rating {
      display: flex;
      justify-content: center;
      align-items: center;
      font-size: 2em;
      direction: rtl;
    }
    .star-rating .fa-star {
      cursor: pointer;
      color: #ddd;
      transition: color 0.3s;
    }
    .star-rating .fa-star:hover,
    .star-rating .fa-star.hovered,
    .star-rating .fa-star.selected {
      color: gold;
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
            <ul class="navbar-nav mb-2 mx-3 mb-lg-0 d-flex flex-row justify-content-start align-items-center text-center gap-3 ms-5">
              <li class="nav-item hide">
                <div class="d-flex flex-row">
                  <p class="text-secondary fw-lighter">Account /</p>
                  <p class="text-dark fw-light">&nbsp;Responde</p>
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
                <a class="nav-link" aria-current="page" href="#"><i class="fa-regular fa-address-card me-2"></i>Profile</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <div class="dashboard-content px-3 pt-4">
        <div class="container-fluid" id="ticketDetails">
          <!-- Elemente dinamice pentru tichet și comentarii vor fi adăugate aici -->
        </div>
        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 mb-xl-3 mb-3">
          <form id="responseForm">
            <div class="form-floating">
              <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px"></textarea>
              <label for="floatingTextarea2">Comments</label>
            </div>
            <div class="d-flex justify-content-end align-items-center position-relative gap-4 mt-3">
              <button type="submit" class="btn-add">Add</button>
              <button type="button" class="btn-close-ticket">Close Ticket</button>
            </div>
          </form>
        </div>
        <div id="ratingSection" class="col-xl-12 col-lg-12 col-md-12 col-sm-12 mb-xl-3 mb-3 d-none">
          <div class="star-rating">
            <i class="fa fa-star" data-value="5"></i>
            <i class="fa fa-star" data-value="4"></i>
            <i class="fa fa-star" data-value="3"></i>
            <i class="fa fa-star" data-value="2"></i>
            <i class="fa fa-star" data-value="1"></i>
            
          </div>
        </div>
      </div>
      <footer class="footer-content d-flex justify-content-between align-items-center">
        <div class="d-flex align-items-center">
          <span class="">&copy; 2024 HelpDesk. All rights reserved.</span>
        </div>
        <div class="d-flex align-items-center">
          <p class="mb-2 me-3"><a href="#" class="text-secondary text-decoration-none">About us</a></p>
          <p class="mb-2"><a href="#" class="text-secondary text-decoration-none">Terms and Conditions</a></p>
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
    var currentUserId = localStorage.getItem("id_utilizator");
    var ticketId = parseInt(localStorage.getItem("id_tichet"), 10);

    if (!currentUserId) {
      alert("Utilizatorul nu este autentificat.");
      return;
    }

    if (isNaN(ticketId)) {
      alert("ID-ul tichetului nu este valid.");
      return;
    }

    var firstEntry;
    var currentRating = null;

    // Obține detaliile tichetului
    $.when(
      $.ajax({ url: "/LiveHelp/rest/tichet/getall", method: "GET" }),
      $.ajax({ url: "/LiveHelp/rest/utilizator/getall", method: "GET" }),
      $.ajax({ url: "/LiveHelp/rest/categorie/getall", method: "GET" }),
      $.ajax({ url: "/LiveHelp/rest/istoric/getall", method: "GET" })
    ).done(function (tichetResponse, utilizatorResponse, categorieResponse, istoricResponse) {
      var tichetMap = {};
      tichetResponse[0].forEach(tichet => {
        tichetMap[tichet.id] = tichet;
      });

      var utilizatorMap = {};
      utilizatorResponse[0].forEach(utilizator => {
        utilizatorMap[utilizator.id] = utilizator;
      });

      var categorieMap = {};
      categorieResponse[0].forEach(categorie => {
        categorieMap[categorie.id] = categorie.nume;
      });

      var istoricMap = istoricResponse[0].filter(entry => entry.id_tichet === ticketId);

      // Afișează tichetul principal (prima înregistrare din istoric)
      if (istoricMap.length > 0) {
        firstEntry = istoricMap[0];
        var tichet = tichetMap[firstEntry.id_tichet];
        var utilizator = utilizatorMap[firstEntry.id_utilizator];
        var categorie = categorieMap[tichet.id_categorie];

        var mainCard = document.createElement("div");
        mainCard.className = "col-xl-12 col-lg-12 col-md-12 col-sm-12 mb-xl-3 mb-3";

        var card = document.createElement("div");
        card.className = "card position-relative";

        var cardHeader = document.createElement("div");
        cardHeader.className = "card-header d-flex justify-content-between align-items-center bg-white position-relative";

        var textStart = document.createElement("div");
        textStart.className = "text-start";

        var categoryP = document.createElement("p");
        categoryP.className = "text-muted mb-1";
        categoryP.textContent = "Category: " + categorie;

        var creatorP = document.createElement("p");
        creatorP.className = "mb-1 fw-lighter";
        creatorP.textContent = "Username: " + utilizator.nume + " " + utilizator.prenume;

        var titleH5 = document.createElement("h5");
        titleH5.className = "mb-0 fw-bold";
        titleH5.textContent = "Ticket Title";

        textStart.appendChild(categoryP);
        textStart.appendChild(creatorP);
        textStart.appendChild(titleH5);
        cardHeader.appendChild(textStart);
        card.appendChild(cardHeader);

        var cardBody = document.createElement("div");
        cardBody.className = "card-body px-5 d-flex justify-content-between align-items-center position-relative";

        var textP = document.createElement("p");
        textP.textContent = firstEntry.text;
        cardBody.appendChild(textP);

        card.appendChild(cardBody);
        mainCard.appendChild(card);
        document.getElementById("ticketDetails").appendChild(mainCard);

        // Afișează comentariile (restul înregistrărilor din istoric)
        istoricMap.slice(1).forEach(entry => {
          var commentUser = utilizatorMap[entry.id_utilizator];

          var commentCard = document.createElement("div");
          commentCard.className = "col-xl-12 col-lg-12 col-md-12 col-sm-12 mb-xl-3 mb-3";

          var commentCardInner = document.createElement("div");
          commentCardInner.className = "card position-relative";

          var commentHeader = document.createElement("div");
          commentHeader.className = "card-header d-flex justify-content-between align-items-center bg-white position-relative";

          var commentTextStart = document.createElement("div");
          commentTextStart.className = "text-start";

          var commentUsernameH5 = document.createElement("h5");
          commentUsernameH5.className = "mb-1 fw-bold";
          commentUsernameH5.textContent = "Username: " + commentUser.nume + " " + commentUser.prenume;

          commentTextStart.appendChild(commentUsernameH5);
          commentHeader.appendChild(commentTextStart);
          commentCardInner.appendChild(commentHeader);

          var commentBody = document.createElement("div");
          commentBody.className = "card-body px-5 d-flex justify-content-between align-items-center position-relative";

          var commentP = document.createElement("p");
          commentP.textContent = entry.text;
          commentBody.appendChild(commentP);

          commentCardInner.appendChild(commentBody);
          commentCard.appendChild(commentCardInner);
          document.getElementById("ticketDetails").appendChild(commentCard);
        });

        // Afișează sistemul de evaluare dacă tichetul este solved
        if (firstEntry.stadiu === "solved") {
          // Afișează secțiunea de rating
          document.getElementById("ratingSection").classList.remove("d-none");

          // Obține ratingul existent, dacă există
          $.get("/LiveHelp/rest/rating/getbyparamfromuri?id_tichet=" + ticketId, function (ratings) {
            if (ratings.length > 0) {
              currentRating = ratings[0];
              highlightStars(currentRating.valoare);
            }
          });

          // Gestionează hover pentru stele
          $(".star-rating .fa-star").on("mouseover", function () {
            var hoverValue = $(this).data("value");
            highlightStars(hoverValue);
          }).on("mouseout", function () {
            if (currentRating) {
              highlightStars(currentRating.valoare);
            } else {
              $(".star-rating .fa-star").removeClass("hovered selected");
            }
          });

          // Gestionează click pentru stele
          $(".star-rating .fa-star").on("click", function () {
            var ratingValue = $(this).data("value");

            // Actualizează sau adaugă rating
            if (currentRating) {
              // Update rating
              $.ajax({
                url: "/LiveHelp/rest/rating/updatebyid?id=" + currentRating.id,
                method: "PUT",
                contentType: "application/json",
                data: JSON.stringify({
                  id: currentRating.id,
                  id_tichet: ticketId,
                  valoare: ratingValue
                }),
                success: function () {
                  alert("Rating updated successfully!");
                  currentRating.valoare = ratingValue;
                },
                error: function () {
                  alert("Error updating rating.");
                }
              });
            } else {
              // Add new rating
              $.ajax({
                url: "/LiveHelp/rest/rating/insert",
                method: "POST",
                contentType: "application/json",
                data: JSON.stringify({
                  id_tichet: ticketId,
                  valoare: ratingValue
                }),
                success: function () {
                  alert("Rating submitted successfully!");
                  currentRating = { id_tichet: ticketId, valoare: ratingValue };
                },
                error: function () {
                  alert("Error submitting rating.");
                }
              });
            }
          });
        }

        // Verifică dacă tichetul este deja închis (solved)
        if (firstEntry.stadiu === "solved") {
          // Dezactivează butonul de adăugare și ascunde butonul de închidere
          document.getElementById("floatingTextarea2").disabled = true;
          document.querySelector(".btn-add").disabled = true;
          document.querySelector(".btn-close-ticket").style.display = "none";
        }

        // Ascunde butonul de închidere dacă utilizatorul este creatorul tichetului
        if (firstEntry.id_utilizator === currentUserId) {
          document.querySelector(".btn-close-ticket").style.display = "none";
        }
      } else {
        document.getElementById("ticketDetails").innerHTML = "<p>No ticket details found.</p>";
      }
    }).fail(function () {
      alert("Error fetching ticket details.");
    });

    // Funcția pentru evidențierea stelelor
    function highlightStars(value) {
      $(".star-rating .fa-star").each(function () {
        var starValue = $(this).data("value");
        if (starValue <= value) {
          $(this).addClass("selected");
        } else {
          $(this).removeClass("selected");
        }
      });
    }

    // Gestionați răspunsul la tichet
    $("#responseForm").on("submit", function (event) {
      event.preventDefault();
      var responseText = $("#floatingTextarea2").val();

      if (!responseText) {
        alert("Please enter a response.");
        return;
      }

      // POST pentru a adăuga comentariul în istoric
      $.ajax({
        url: "/LiveHelp/rest/istoric/insert",
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify({
          id_tichet: ticketId,
          id_utilizator: currentUserId,
          stadiu: "response",
          text: responseText
        }),
        success: function () {
          // PUT pentru a actualiza stadiul tichetului la "working"
          $.ajax({
            url: "/LiveHelp/rest/istoric/updatebyid?id=" + firstEntry.id,
            method: "PUT",
            contentType: "application/json",
            data: JSON.stringify({
              stadiu: "working",
              text: firstEntry.text
            }),
            success: function () {
              // Trimitere notificare către utilizatorul care a creat tichetul
              var notificationData = {
                id_tichet: ticketId,
                id_utilizator: firstEntry.id_utilizator,
                stadiu: "unread",
                text: "You have received a response."
              };

              $.ajax({
                url: "/LiveHelp/rest/notificare/insert",
                method: "POST",
                contentType: "application/json",
                data: JSON.stringify(notificationData),
                success: function () {
                  console.log("Notification sent to user ID: " + firstEntry.id_utilizator);
                  alert("Response added and ticket status updated to 'working' successfully!");
                  location.reload(); // Reîncarcă pagina pentru a afișa noile comentarii și status
                },
                error: function () {
                  alert("Eroare la trimiterea notificării.");
                }
              });
            },
            error: function () {
              alert("Error updating ticket status.");
            }
          });
        },
        error: function () {
          alert("Error adding response.");
        }
      });
    });

    // Gestionați închiderea tichetului
    $(".btn-close-ticket").on("click", function () {
      // PUT pentru a actualiza stadiul tichetului la "solved"
      $.ajax({
        url: "/LiveHelp/rest/istoric/updatebyid?id=" + firstEntry.id,
        method: "PUT",
        contentType: "application/json",
        data: JSON.stringify({
          stadiu: "solved",
          text: firstEntry.text
        }),
        success: function () {
          // Trimitere notificare către utilizatorul care a creat tichetul
          var notificationData = {
            id_tichet: ticketId,
            id_utilizator: firstEntry.id_utilizator,
            stadiu: "unread",
            text: "Your ticket has been solved."
          };

          $.ajax({
            url: "/LiveHelp/rest/notificare/insert",
            method: "POST",
            contentType: "application/json",
            data: JSON.stringify(notificationData),
            success: function () {
              console.log("Notification sent to user ID: " + firstEntry.id_utilizator);
              alert("Ticket closed successfully!");

              // Reîncarcă pagina pentru a reflecta modificările
              location.reload();
            },
            error: function () {
              alert("Eroare la trimiterea notificării.");
            }
          });
        },
        error: function () {
          alert("Error closing ticket.");
        }
      });
    });

    // Gestionarea notificărilor
    $.get("/LiveHelp/rest/notificare/getbyparamfromuri?id_utilizator=" + currentUserId, function (notifications) {
      var unreadCount = 0;
      var notificationList = document.getElementById("notificationList");

      // Curăță lista de notificări existentă
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
        // Afișează doar ultimele 5 notificări
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

          // Eveniment de click pentru redirecționare și salvare în localStorage
          listItem.addEventListener("click", function () {
            // Schimbă stadiul notificării la "read"
            $.ajax({
              url: "/LiveHelp/rest/notificare/updatebyid?id=" + notification.id,
              method: "PUT",
              contentType: "application/json",
              data: JSON.stringify({ stadiu: "read" }),
              success: function () {
                console.log("Notification ID " + notification.id + " marked as read.");
                // Salvează id_tichet în localStorage și redirecționează
                localStorage.setItem("id_tichet", notification.id_tichet);
                window.location.href = "/LiveHelp/respond-ticket";
              },
              error: function () {
                console.error("Eroare la marcarea notificării ID " + notification.id + " ca citită.");
              }
            });
          });
        });

        // Afișează numărul de notificări necitite dacă există
        if (unreadCount > 0) {
          document.getElementById("unreadCount").textContent = unreadCount;
          document.getElementById("unreadCount").style.display = ""; // Afișează contorul
        } else {
          document.getElementById("unreadCount").style.display = "none"; // Ascunde contorul dacă nu sunt notificări
        }
      }

      // Marcarea tuturor notificărilor ca citite
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
              console.error("Eroare la marcarea notificării ID " + notification.id + " ca citită.");
            }
          });
        });

        location.reload();
      });
    }).fail(function () {
      alert("Eroare la obținerea notificărilor.");
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
          window.location.href = "/LiveHelp/create-ticket";
      });
  });

  </script>
</body>
</html>
