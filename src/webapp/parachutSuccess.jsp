<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
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
<div>
    <h1>Details</h1>
    <h1>Parachut report</h1>
    <h2>${message}</h2>
    <p><strong>Parachut Type:</strong>${parachutDto.parachutType}</p>
    <p><strong>Is Reusable:</strong>${parachutDto.n_reusable}</p>
    <p><strong>Deployment Type:</strong>${parachutDto.deploymentType}</p>
    <p><strong>Manufactured by:</strong>${parachutDto.manufacturedBy}</p>
    <p><strong>Capacity:</strong>${parachutDto.n_capacity}</p>
    <p><strong>Cost:</strong>${parachutDto.n_cost}</p>


</div>



</body>
</html>