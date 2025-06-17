<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        .shaded-navbar {
  background: linear-gradient(to bottom, #66b2ff, #000000); /* light blue to black */
}
    </style>
</head>
<body style="background-color:#7577b1ba;">
<nav class="navbar shaded-navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#" style="color:white">PARACHUT</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="index.jsp" STYLE="color:white">Home</a>
                <a class="nav-link active" aria-current="page" href="parachut.jsp" STYLE="color:white">Form</a>

            </div>
        </div>
    </div>
</nav>
<form action="search" method="post">
    <div align="center">
        <div class="mb-3">
            <label for="exampleInputEmail11" class="form-label">Search Parachut </label>
            <div class="d-flex justify-content-center">
                <input type="text" placeholder="Enter ID" class="form-control" id="exampleInputEmail11" style="width: 500px;" name="id">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>


</form>

</body>
</html>