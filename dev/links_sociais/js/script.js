; (function () {
	'use strict'

	const btnTheme = document.getElementById('btn-theme')
	const root = document.body

	let currentTheme = 'dark'

	btnTheme.addEventListener('click', () => {
		console.log('currentTheme', currentTheme)

		if (currentTheme === 'dark') {
			console.log('entrou sim')
			root.classList.replace('dark', 'light')
			currentTheme = 'light'
			return
		}

		console.log('entrou nao')
		root.classList.replace('light', 'dark')
		currentTheme = 'dark'
	})

})()