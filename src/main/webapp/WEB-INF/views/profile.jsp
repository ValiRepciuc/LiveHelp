<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"/>
    <link rel="stylesheet" href="static/css/styling/profile.css" />
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
                        <li class="active">
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

        <!-- Content Area -->
        <div class="content bg-light">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-md navbar-light bg-light">
                <div class="container-fluid d-flex justify-content-between">
                    <div class="d-flex justify-content-end w-100">
                        <div class="d-flex justify-content-start d-md-none d-block">
                            <button class="btn px-1 py-0 open-btn me-2">
                                <i class="fa-solid fa-bars"></i>
                            </button>
                        </div>
                        <ul class="navbar-nav mb-2 mx-3 mb-lg-0 d-flex flex-row justify-content-start align-items-center text-center gap-3 ms-5">
                            <li class="nav-item">
                                <div class="d-flex flex-row">
                                    <p class="text-secondary fw-lighter">Account /</p>
                                    <p class="text-dark fw-light">&nbsp;Profile</p>
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

            <!-- User Info Card and Edit Profile Card -->
            <div class="dashboard-content px-3 pt-4">
                <div class="container-fluid">
                    <!-- User Info Card -->
                    <div class="card card-body mx-3 mx-md-4 mt-n6">
                        <div class="row gx-4">
                            <div class="col-auto">
                                <div class="avatar avatar-xl position-relative">
                                    <i class="fa-solid fa-user-tie fa-3x"></i>
                                </div>
                            </div>
                            <div class="col-auto my-auto">
                                <div class="h-100">
                                    <h5 class="mb-1" id="userName">Name</h5>
                                    <p class="mb-0 font-weight-normal text-sm text-secondary fw-light" id="userRole">Role</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Edit Profile Card -->
                    <div class="card mt-4">
                        <div class="card-header">
                            <h4>Edit Profile</h4>
                        </div>
                        <div class="card-body">
                            <form id="editProfileForm">
                                <div class="mb-3 row">
                                    <label for="firstName" class="col-sm-2 col-form-label">First Name</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="firstName" placeholder="First Name" />
                                    </div>
                                </div>
                                <div class="mb-3 row">
                                    <label for="lastName" class="col-sm-2 col-form-label">Last Name</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="lastName" placeholder="Last Name" />
                                    </div>
                                </div>
                                <div class="mb-3 row">
                                    <label for="email" class="col-sm-2 col-form-label">Email</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="email" placeholder="Email" />
                                    </div>
                                </div>
                                <div class="mb-3 row">
                                    <label for="phone" class="col-sm-2 col-form-label">Phone</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="phone" placeholder="Phone" />
                                    </div>
                                </div>
                                <button type="submit" class="btn-save">Save Changes</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
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

        // Obține datele utilizatorului
        $.ajax({
            url: "/LiveHelp/rest/utilizator/getbyid?id=" + currentUserId,
            method: "GET",
            success: function (userData) {
                var userName = (userData.nume && userData.prenume)
                    ? userData.nume + " " + userData.prenume
                    : "Nume Prenume";

                // Afișează datele utilizatorului în card și formular
                $('#userName').text(userName);
                $('#firstName').val(userData.nume);
                $('#lastName').val(userData.prenume);
                $('#email').val(userData.email);
                $('#phone').val(userData.telefon);
                
                // Obține rolul utilizatorului
                $.ajax({
                    url: "/LiveHelp/rest/rol/getbyid?id=" + currentUserId, // Presupunând că acest endpoint există
                    method: "GET",
                    success: function (roleData) {
                        $('#userRole').text(roleData.nume); // Afișează rolul utilizatorului
                    },
                    error: function () {
                        $('#userRole').text("Rol necunoscut"); // Dacă nu putem obține rolul
                    }
                });
            },
            error: function () {
                alert("Eroare la obținerea datelor utilizatorului.");
            }
        });

        // Trimiterea formularului pentru actualizarea datelor utilizatorului
        $('#editProfileForm').on('submit', function (e) {
            e.preventDefault();

            var updatedUser = {
                nume: $('#firstName').val(),
                prenume: $('#lastName').val(),
                email: $('#email').val(),
                telefon: $('#phone').val()
            };

            $.ajax({
                url: "/LiveHelp/rest/utilizator/updatebyid?id=" + currentUserId,
                method: "PUT",
                contentType: "application/json",
                data: JSON.stringify(updatedUser),
                success: function () {
                    location.reload();
                    alert("Datele au fost actualizate cu succes.");
                },
                error: function () {
                    alert("Eroare la actualizarea datelor.");
                }
            });
        });

        // Notification functionality
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
