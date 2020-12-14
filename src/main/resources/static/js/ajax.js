const $body = document.getElementById("root");
const $container = document.createElement("div");
let count;
let isEnd = false

const afterClick = async () => {
  if (isEnd) {
    return;
  }
  if (count < 5) {
    const response = await fetch("http://localhost:8080/ajax/get");
    const body = await response.json();
    $container.insertAdjacentHTML("beforeend", `<h2>응답 : ${body.message}</h2>`)
    count++;
    return;
  }
  $container.insertAdjacentHTML("beforeend", `<a href="http://localhost:8080/ajax/practice">실습 하러 가기</a>`)
  isEnd = true;
}

const initEventListener = () => {
  const $getButton = document.getElementById("btn-get");

  $getButton.addEventListener("click", afterClick);
}

const init = () => {
  count = 0;
  $body.insertAdjacentHTML("afterbegin", "<h1>AJAX</h1>");
  $body.insertAdjacentElement("beforeend", $container);
  $container.insertAdjacentHTML("afterbegin", `<button id="btn-get">GET 요청 보내기</button>`);

  initEventListener();
}

init();