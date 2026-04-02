; (function () {
	'use strict'

	const btnTheme = document.getElementById('btn-theme')
	const root = document.body

	let currentTheme = 'dark'

	btnTheme.addEventListener('click', () => {
		if (currentTheme === 'dark') {
			root.classList.replace('dark', 'light')
			currentTheme = 'light'
			return
		}

		root.classList.replace('light', 'dark')
		currentTheme = 'dark'
	})

})()