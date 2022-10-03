const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const n = document.querySelector('#name');
const b = document.querySelector('#blog');
const l = document.querySelector('.location');



async function displayUser(username) {
  n.textContent = 'cargando...';
  const promesa = fetch(`${usersEndpoint}/${username}`, {method : "GET"});
  await promesa.then((response)=> {
    response.json().then((data)=>{
      console.log(data);
      n.textContent = `${data.name}`;
      b.textContent = `${data.blog}`;
      l.textContent = `${data.location}`;
    
    }).catch((errorJson)=>{
      console.log('OH NO!');
      console.log(errorJson);
      n.textContent = `Algo salió mal: ${errorJson}`;

  });//catch Json response

  }).catch((err)=>{
    console.log('OH NO!');
    console.log(err);
    n.textContent = `Algo salió mal: ${err}`; 
});//catch promesa
}//funcion display name



window.addEventListener("load", function(e){
  displayUser('stolinski');

});//funcion