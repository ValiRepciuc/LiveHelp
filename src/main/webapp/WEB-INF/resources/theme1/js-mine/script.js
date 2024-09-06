$(document).ready(function () {
  $('.add-departament-button').click(function () {
    $('#addDepartamentModal').modal('show');
  });

  $('.pen-button').click(function () {
    $('#editDepartamentModal').modal('show');
  });

  $('.icon-button').click(function () {
    $('#deleteDepartamentModal').modal('show');
  });

  $('.add-employee-button').click(function () {
    $('#addEmployeeModal').modal('show');
  });

  $('.pen-button1').click(function () {
    $('#editEmployeeModal').modal('show');
  });

  $('.icon-button1').click(function () {
    $('#deleteEmployeeModal').modal('show');
  });

  $('#sidebarCollapse').on('click', function() {
    $('#sidebar, #content').toggleClass('active');
  });

$("#nav_departamente").click(function () {
  var $departamenteTable = $('.table-container');
  if (!$departamenteTable.hasClass('hidden')) {
    return; 
  }
  $departamenteTable.removeClass('hidden');
  $('.table-container2').addClass('hidden');
  $('.welcome-text').addClass('hidden');
  $('.hr-dashboard').addClass('hidden');
  $('.container3').addClass('hidden');
  $('.table-container3').addClass('hidden');
  $('.table-container4').addClass('hidden');
});

$("#nav_angajati").click(function () {
  var $angajatiTable = $('.table-container2');
  if (!$angajatiTable.hasClass('hidden')) {
    return; 
  }
  $angajatiTable.removeClass('hidden'); 
  $('.table-container').addClass('hidden');
  $('.welcome-text').addClass('hidden');
  $('.hr-dashboard').addClass('hidden');
  $('.container3').addClass('hidden');
  $('.table-container3').addClass('hidden');
  $('.table-container4').addClass('hidden');
});

$("#nav_misiune").click(function () {
  var $misiuneSection = $('.hr-dashboard');
  if (!$misiuneSection.hasClass('hidden')) {
    return; 
  }

  $misiuneSection.removeClass('hidden'); 
  var $ceva = $('.hr-dashboard').children("h1.first");
  $('.table-container2').addClass('hidden');
  $('.table-container').addClass('hidden');
  $('.welcome-text').addClass('hidden');
  $('.container3').addClass('hidden');
  $('.table-container3').addClass('hidden');
  $('.table-container4').addClass('hidden');
});


$("#nav_profil").click(function () {
  var $angajatSection = $('.container3');
  if (!$angajatSection.hasClass('hidden')) {
    return; 
  }
  $angajatSection.removeClass('hidden'); 
  $('.hr-dashboard').addClass('hidden');
  $('.table-container2').addClass('hidden');
  $('.table-container').addClass('hidden');
  $('.welcome-text').addClass('hidden');
  $('.table-container3').addClass('hidden');
  $('.table-container4').addClass('hidden');
});

$("#nav_concediu").click(function () {
  var $angajatSection = $('.table-container3');
  if (!$angajatSection.hasClass('hidden')) {
    return; 
  }

  $angajatSection.removeClass('hidden'); 
  $('.hr-dashboard').addClass('hidden');
  $('.table-container2').addClass('hidden');
  $('.table-container').addClass('hidden');
  $('.welcome-text').addClass('hidden');
  $('.container3').addClass('hidden');
  $('.table-container4').addClass('hidden');
});

$("#nav_domeniu").click(function () {
  var $angajatSection = $('.table-container4');
  if (!$angajatSection.hasClass('hidden')) {
    return; 
  }

  $angajatSection.removeClass('hidden'); 
  $('.hr-dashboard').addClass('hidden');
  $('.table-container2').addClass('hidden');
  $('.table-container').addClass('hidden');
  $('.welcome-text').addClass('hidden');
  $('.container3').addClass('hidden');
  $('.table-container3').addClass('hidden');
});

  
  $("#changeImageButton").click(function () {
      $("#imageInput").click();
  });

  $("#imageInput").on("change", function () {
      var file = this.files[0];
      var reader = new FileReader();

      reader.onloadend = function () {
          $("#profileImage").attr("src", reader.result);
      };

      if (file) {
          reader.readAsDataURL(file);
      }
  });

const addButton = $(".add-concediu-button");
const popupContainer = $(".popup-container");
const closeButton = $("#close-button");
const submitButton = $("#submit-button");

addButton.on("click", function() {
  popupContainer.show();
});

closeButton.on("click", function() {
  popupContainer.hide();
});

submitButton.on("click", function() {
  const nume = $("#nume").val();
  const prenume = $("#prenume").val();
  const departament = $("#departament").val();
  const organizatie = $("#organizatie").val();
  const cnp = $("#cnp").val();
  const functie = $("#functie").val();
  const dataStart = $("#data-start").val();
  const dataEnd = $("#data-end").val();

  if (nume && prenume && departament && organizatie && cnp && functie && dataStart && dataEnd) {
    const newRow = `
      <tr>
        <td>
          <div class="button-container">
            <button class="icon-button1"><i class="fas fa-trash-alt"></i></button>
            <button class="pen-button1"><i class="fas fa-pen"></i></button>
          </div>
        </td>
        <td>${nume}</td>
        <td>${prenume}</td>
        <td>${departament}</td>
        <td>${organizatie}</td>
        <td>${cnp}</td>
        <td>${functie}</td>
        <td>${dataStart} - ${dataEnd}</td>
      </tr>
    `;
    $("#table-body").append(newRow);
    popupContainer.hide();
  }
});

const addDomeniuButton = $(".add-domeniu-button");
const popupContainer2 = $(".popup-container2");
const closeButton2 = $("#close-button2");
const submitButton2 = $("#submit-button2");

addDomeniuButton.on("click", function() {
  popupContainer2.show();
});

closeButton2.on("click", function() {
  popupContainer2.hide();
});

submitButton2.on("click", function() {
  const nume2 = $("#nume2").val(); 
  const descriere = $("#descriere").val(); 

  if (nume2 && descriere) {
    const newRow2 = `
      <tr>
        <td>
          <div class="button-container">
            <button class="icon-button1"><i class="fas fa-trash-alt"></i></button>
            <button class="pen-button1"><i class="fas fa-pen"></i></button>
          </div>
        </td>
        <td>${nume2}</td>
        <td>${descriere}</td>
      </tr>
    `;
    $("#table-body2").append(newRow2);
    popupContainer2.hide();
  }
});


var dateClass = '.data-start';
var dateClass2 = '.data-end';

if ($(dateClass).prop('type') !== 'date') {
  var oCSS = document.createElement('link');
  oCSS.type = 'text/css';
  oCSS.rel = 'stylesheet';
  oCSS.href = 'https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/base/jquery-ui.css';
  oCSS.onload = function() {
    var oJS = document.createElement('script');
    oJS.type = 'text/javascript';
    oJS.src = 'https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js';
    oJS.onload = function() {
      $(dateClass).datepicker();
      $(dateClass2).datepicker();
    };
    document.body.appendChild(oJS);
  };
  document.body.appendChild(oCSS);
} else {
  $(dateClass2).datepicker();
}

});

function showPopup() {
  $("#popup10").css("display", "block");
}

function closePopup() {
  $("#popup10").css("display", "none");
}
