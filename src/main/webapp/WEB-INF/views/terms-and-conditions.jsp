<!DOCTYPE html>
<html lang="en">
<head>
  <title>Terms and Conditions</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
  <link rel="stylesheet" href="static/css/styling/sidebar.css" />
  <link rel="stylesheet" href="static/css/styling/navbar.css" />
  <style>
    @media (max-width: 767px) {
      .hide {
        display: none;
      }
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
          <p class="text-white fw-bold d-block px-3 py-4 d-block" style="font-size: 12px">ACCOUNT PAGES</p>
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
                <p class="text-dark fw-light">&nbsp;Terms and Conditions</p>
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
      <div class="container-fluid">
        <div class="card">
          <div class="card-header">
            <h4>Terms and Conditions</h4>
          </div>
          <div class="card-body">
            <h5>1. Introduction</h5>
            <p>
              Welcome to HelpDesk! These terms and conditions outline the
              rules and regulations for the use of HelpDesk's Website,
              located at HelpDesk.com.
            </p>
            <h5>2. Intellectual Property Rights</h5>
            <p>
              Other than the content you own, under these Terms, HelpDesk
              and/or its licensors own all the intellectual property rights
              and materials contained in this Website.
            </p>
            <h5>3. Restrictions</h5>
            <p>
              You are specifically restricted from all of the following:
            </p>
            <ul>
              <li>publishing any Website material in any other media;</li>
              <li>
                selling, sublicensing and/or otherwise commercializing any
                Website material;
              </li>
              <li>
                publicly performing and/or showing any Website material;
              </li>
              <li>
                using this Website in any way that is or may be damaging to
                this Website;
              </li>
              <li>
                using this Website in any way that impacts user access to
                this Website;
              </li>
              <li>
                using this Website contrary to applicable laws and
                regulations, or in any way may cause harm to the Website, or
                to any person or business entity;
              </li>
              <li>
                engaging in any data mining, data harvesting, data
                extracting or any other similar activity in relation to this
                Website;
              </li>
              <li>
                using this Website to engage in any advertising or
                marketing.
              </li>
            </ul>
            <h5>4. Your Content</h5>
            <p>
              In these Website Standard Terms and Conditions, 'Your Content'
              shall mean any audio, video text, images or other material you
              choose to display on this Website. By displaying Your Content,
              you grant HelpDesk a non-exclusive, worldwide irrevocable,
              sub-licensable license to use, reproduce, adapt, publish,
              translate and distribute it in any and all media.
            </p>
            <h5>5. No warranties</h5>
            <p>
              This Website is provided as is, with all faults, and
              HelpDesk express no representations or warranties, of any kind
              related to this Website or the materials contained on this
              Website. Also, nothing contained on this Website shall be
              interpreted as advising you.
            </p>
            <h5>6. Limitation of liability</h5>
            <p>
              In no event shall HelpDesk, nor any of its officers, directors
              and employees, shall be held liable for anything arising out
              of or in any way connected with your use of this Website
              whether such liability is under contract. HelpDesk, including
              its officers, directors and employees shall not be held liable
              for any indirect, consequential or special liability arising
              out of or in any way related to your use of this Website.
            </p>
            <h5>7. Indemnification</h5>
            <p>
              You hereby indemnify to the fullest extent HelpDesk from and
              against any and/or all liabilities, costs, demands, causes of
              action, damages and expenses arising in any way related to
              your breach of any of the provisions of these Terms.
            </p>
            <h5>8. Severability</h5>
            <p>
              If any provision of these Terms is found to be invalid under
              any applicable law, such provisions shall be deleted without
              affecting the remaining provisions herein.
            </p>
            <h5>9. Variation of Terms</h5>
            <p>
              HelpDesk is permitted to revise these Terms at any time as it
              sees fit, and by using this Website you are expected to review
              these Terms on a regular basis.
            </p>
            <h5>10. Assignment</h5>
            <p>
              The HelpDesk is allowed to assign, transfer, and subcontract
              its rights and/or obligations under these Terms without any
              notification. However, you are not allowed to assign,
              transfer, or subcontract any of your rights and/or obligations
              under these Terms.
            </p>
            <h5>11. Entire Agreement</h5>
            <p>
              These Terms constitute the entire agreement between HelpDesk
              and you in relation to your use of this Website, and supersede
              all prior agreements and understandings.
            </p>
            <h5>12. Governing Law & Jurisdiction</h5>
            <p>
              These Terms will be governed by and interpreted in accordance
              with the laws of the State of [Your State], and you submit to
              the non-exclusive jurisdiction of the state and federal courts
              located in [Your State] for the resolution of any disputes.
            </p>
          </div>
        </div>
      </div>
    </div>
    <footer class="footer-content d-flex justify-content-between align-items-center">
      <div class="d-flex align-items-center"><span class="">&copy; 2024 HelpDesk. All rights reserved.</span></div>
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
 <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
<script>
$(document).ready(function () {
  var userId = localStorage.getItem("id_utilizator");
  if (!userId) {
    alert("Nu s-a găsit utilizator logat.");
    return;
  }

  // Fetch notifications
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
