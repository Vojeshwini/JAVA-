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
        <a class="navbar-brand" href="#" style="color:white">PARACHUTE</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="index.jsp" STYLE="color:white">Home</a>
            </div>
        </div>
    </div>
</nav>
<div align="center">
    <h1>FILL THE INFORMATION!!!</h1>
    <BR>
    <form action="submit" method="post">
     <div>
         <label for="parachutType">Parachute Type:</label>
         <div  class="d-flex justify-content-center">
         <select id="parachutType" name="parachutType" style="width: 500px;" class="form-control" placeholder="Parachut Type" id="exampleInputEmail1" >
             <option value="" disabled selected>Select the Type</option>
             <option value="Round">Round</option>
             <option value="Cruciform">Cruciform </option>
             <option value="Annular">Annular </option>
             <option value="Ribbon">Ribbon  </option>
             <option value="Rogallo">Rogallo  </option>
             <option value="Ram-Air">Ram-Air </option>
         </select>
         </div>
     </div>

        <div>
            <label for="parachutType">Reusable:</label>
            <div  class="d-flex justify-content-center">
                <select id="reusable" name="reusable" style="width: 500px;" class="form-control" placeholder="Parachut Type" id="exampleInputEmail3" >
                    <option value="" disabled selected>Select </option>
                    <option value="True">Yes</option>
                    <option value="false">No </option>

                </select>
            </div>
        </div>


        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Deployment Type</label>
            <div class="d-flex justify-content-center">
                <input type="text" placeholder="Deployment Type" class="form-control" id="exampleInputEmail4" style="width: 500px;" name="deploymentType">
            </div>
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Manufactured By</label>
            <div class="d-flex justify-content-center">
                <input type="text" placeholder="Company" class="form-control" id="exampleInputEmail5" style="width: 500px;" name="manufacturedBy">
            </div>
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Capacity</label>
            <div class="d-flex justify-content-center">
                <input type="number" placeholder="Max weight it carry in KG" class="form-control" id="exampleInputEmail7" style="width: 500px;" name="capacity">
            </div>
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Cost</label>
            <div class="d-flex justify-content-center">
                <input type="number" placeholder="Cost" class="form-control" id="exampleInputEmail6" style="width: 500px;" name="cost">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</div>


</body>
</html>