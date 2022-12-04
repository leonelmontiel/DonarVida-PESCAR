const header = document.querySelector("header");


const links = document.querySelectorAll(".nav-link");


const toggle_btn = document.querySelector(".toggl-btn")


window.addEventListener("scroll", () => {
    skillsCounter();
})




//STICKY NAVBAR//

function stickyNavbar() {
    header.classList.toggle("scrolled", window.pageYOffset > 0)
}

stickyNavbar();

window.addEventListener("scroll", stickyNavbar)

window.addEventListener("scroll", () => {
    activeLink()
})