<%@page contentType="text/html" pageEncoding="UTF-8" %> <%@taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/style.css" />

    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
      crossorigin="anonymous"
    />
    <script
      src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
      integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
      integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
      crossorigin="anonymous"
    ></script>

    <title>Mystic</title>
    <style>
      .getStarted {
        text-decoration: none;
        border-radius: 1rem;
        padding: 1rem !important;
      }
      .getStarted:focus {
        outline: none;
        box-shadow: none !important;
      }
    </style>
  </head>
  <body>
    <header class="main-header clearfix" role="header">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="/Mystic-Servlet/index/">
            <img
              src="https://img.icons8.com/external-itim2101-lineal-color-itim2101/64/000000/external-employee-human-resource-itim2101-lineal-color-itim2101.png"
              alt=""
              width="50"
              height="50"
              style="margin: 1rem"
            />
            <h3 style="display: inline; margin-top: 3rem">Mystic</h3>
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#navbarSupportedContent"
          >
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul
              class="navbar-nav"
              style="flex-grow: 1; justify-content: center"
            >
              <li class="nav-item">
                <a
                  class="nav-link"
                  aria-current="page"
                  href="/Mystic-Servlet/index/"
                  ><h5 style="display: inline">Home</h5></a
                >
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/Mystic-Servlet/jobs/"
                  ><h5 style="display: inline">Jobs</h5></a
                >
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/Mystic-Servlet/about/"
                  ><h5 style="display: inline">About</h5></a
                >
              </li>
              <li class="nav-item">
                <a
                  class="nav-link active"
                  aria-current="page"
                  href="/Mystic-Servlet/recents/"
                  ><h5 style="display: inline">Recents</h5></a
                >
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>

    <!-- main section -->
    <div
      class="container-fluid"
      style="
        background-image: url('/img/hero-bg.png');
        background-repeat: no-repeat;
        background-size: cover;
        height: 92vh;
        display: flex;
        justify-content: center;
        text-align: center;
      "
    >
      <div class="container-fluid" style="overflow: scroll">
        <table class="table table-striped table-hover">
          <tr>
            <th>Name</th>
            <th>Gender</th>
            <th>Email</th>
            <th>CGPA</th>
          </tr>
          <c:forEach items="${applications}" var="application">
            <tr>
              <td>${application.firstName} ${application.lastName}</td>
              <td>${application.gender}</td>
              <td>${application.email}</td>
              <td>${application.cgpa}</td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </div>

    <script>
      (function () {
        console.log("Function Called");
        var forms = document.querySelectorAll(".needs-validation");
        Array.prototype.slice.call(forms).forEach(function (form) {
          form.addEventListener(
            "submit",
            function (event) {
              if (!form.checkValidity()) {
                event.preventDefault();
                event.stopPropagation();
              }

              form.classList.add("was-validated");
            },
            false
          );
        });
      })();
    </script>
  </body>
</html>
